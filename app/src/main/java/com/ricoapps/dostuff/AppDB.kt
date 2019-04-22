package com.ricoapps.dostuff

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [(Todo::class)], version = 1)
abstract class AppDB : RoomDatabase() {
    abstract fun todoDao() : TodoDao
}