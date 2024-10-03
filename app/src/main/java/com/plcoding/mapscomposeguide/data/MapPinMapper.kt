package com.plcoding.mapscomposeguide.data

import com.plcoding.mapscomposeguide.domain.model.MapPin


fun MapPinEntity.toMapPin(): MapPin {
    return MapPin(
        lat,
        lng,
        id
    )
}

fun MapPin.toMapPinEntity(): MapPinEntity {
    return MapPinEntity(
        lat,
        lng,
        id
    )
}