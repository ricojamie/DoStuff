package com.ricoapps.dostuff

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface TodoDao {

    @Insert
    fun saveNewTodo(todo: Todo)

    @Query("SELECT * FROM todo")
    fun todos() : List<Todo>
}