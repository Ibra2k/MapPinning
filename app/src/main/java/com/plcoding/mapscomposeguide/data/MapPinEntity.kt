package com.plcoding.mapscomposeguide.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MapPinEntity(
    val lat: Double,
    val lng: Double,
    @PrimaryKey val id: Int? = null
)
