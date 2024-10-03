package com.plcoding.mapscomposeguide.presentation

import com.google.android.gms.maps.model.LatLng
import com.plcoding.mapscomposeguide.domain.model.MapPin

sealed class MapEvent {
    object toggleFalloutMap: MapEvent()
    data class onMapLongClick(val latLng: LatLng): MapEvent()
    data class onInfoWindowLongClick(val spot: MapPin): MapEvent()

}