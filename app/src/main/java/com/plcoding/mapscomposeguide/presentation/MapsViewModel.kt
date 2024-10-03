package com.plcoding.mapscomposeguide.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.android.gms.maps.model.MapStyleOptions
import com.plcoding.mapscomposeguide.domain.model.MapPin
import com.plcoding.mapscomposeguide.domain.repository.MapPinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(
    private val repository: MapPinRepository
) : ViewModel(){

    var state by mutableStateOf(MapState())

    init {
        viewModelScope.launch {
            repository.getMapPin().collectLatest { spots ->
                state = state.copy(
                    mapPins = spots
                )
            }
        }
    }

    fun onEvent(event: MapEvent){
        when(event){
            is MapEvent.toggleFalloutMap -> {
                state = state.copy(
                    properties = state.properties.copy(
                    mapStyleOptions = if(state.isFalloutMap){null} else MapStyleOptions(MapStyle.json)),
                    isFalloutMap = !state.isFalloutMap
                )
            }

            is MapEvent.onMapLongClick -> {
                viewModelScope.launch {
                    repository.insertMapPin(
                        MapPin(event.latLng.latitude, event.latLng.longitude)
                    )
                }
            }

            is MapEvent.onInfoWindowLongClick -> {
                viewModelScope.launch {
                    repository.deleteMapPin(
                        event.spot
                    )
                }
            }

        }
    }
}