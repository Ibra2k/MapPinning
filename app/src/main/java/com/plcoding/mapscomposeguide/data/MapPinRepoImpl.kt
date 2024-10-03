package com.plcoding.mapscomposeguide.data

import androidx.room.Dao
import com.plcoding.mapscomposeguide.domain.model.MapPin
import com.plcoding.mapscomposeguide.domain.repository.MapPinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MapPinRepoImpl(private val dao: MapPinDao): MapPinRepository{

    override suspend fun insertMapPin(spot: MapPin) {
        dao.insertPin(spot.toMapPinEntity())
    }

    override suspend fun deleteMapPin(spot: MapPin) {
        dao.deletePin(spot.toMapPinEntity())
    }

    override fun getMapPin(): Flow<List<MapPin>> {
        return dao.getPins().map { pins ->
            pins.map { it.toMapPin() }
        }
    }
}