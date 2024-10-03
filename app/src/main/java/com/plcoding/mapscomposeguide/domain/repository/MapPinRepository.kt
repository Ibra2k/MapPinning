package com.plcoding.mapscomposeguide.domain.repository

import com.plcoding.mapscomposeguide.domain.model.MapPin
import kotlinx.coroutines.flow.Flow

interface MapPinRepository {
    suspend fun insertMapPin(spot: MapPin)

    suspend fun deleteMapPin(spot: MapPin)

    fun getMapPin(): Flow<List<MapPin>>
}