package com.plcoding.mapscomposeguide.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [MapPinEntity::class],
    version = 1
)

abstract class MapPinDatabase: RoomDatabase() {
    abstract val dao: MapPinDao
}