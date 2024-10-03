package com.plcoding.mapscomposeguide.presentation

import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties
import com.plcoding.mapscomposeguide.domain.model.MapPin

data class MapState(
    val properties: MapProperties = MapProperties(
        mapStyleOptions = MapStyleOptions(MapStyle.json)
    ),
    val mapPins: List<MapPin> = emptyList(),
    val isFalloutMap: Boolean = false
)
