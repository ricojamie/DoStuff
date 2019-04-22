package com.ricoapps.dostuff

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Todo {
    @PrimaryKey
    var todoId: Int? = null

    @ColumnInfo
    var todoItem: String? = null

    @ColumnInfo
    var todoPriority: Int? = null

    @ColumnInfo
    var isComplete: Boolean? = null

    @ColumnInfo
    var dueDate: String? = null

    @ColumnInfo
    var todoTag: String? = null

    @ColumnInfo
    var todoList: String? = null
}