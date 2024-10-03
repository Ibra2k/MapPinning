package com.plcoding.mapscomposeguide.di

import android.app.Application
import androidx.room.Room
import com.plcoding.mapscomposeguide.MapPinApplication
import com.plcoding.mapscomposeguide.data.MapPinDatabase
import com.plcoding.mapscomposeguide.data.MapPinRepoImpl
import com.plcoding.mapscomposeguide.domain.repository.MapPinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMapPinDatabase(app: Application): MapPinDatabase {
        return Room.databaseBuilder(
            app,
            MapPinDatabase::class.java,
            "map_pin.db").build()
    }

    @Singleton
    @Provides
    fun provideMapPinRepository(db: MapPinDatabase): MapPinRepository{
        return MapPinRepoImpl(db.dao)
    }
}