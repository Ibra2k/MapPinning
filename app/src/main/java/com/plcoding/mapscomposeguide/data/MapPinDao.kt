package com.plcoding.mapscomposeguide.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MapPinDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPin(spot: MapPinEntity)

    @Delete
    suspend fun deletePin(spot: MapPinEntity)

    @Query("SELECT * FROM mappinentity") //Returns a flow so we dont need to make it async (Flow is async as default // )
    fun getPins(): Flow<List<MapPinEntity>>

}