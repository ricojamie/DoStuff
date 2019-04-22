package com.ricoapps.dostuff

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext,
            AppDB::class.java, "todoDB")
            .build()

        Thread {
            val todo = Todo()
            todo.isComplete = false
            todo.todoId = 45455
            todo.todoItem = "Finish them"
            todo.todoPriority = 1

            db.todoDao().saveNewTodo(todo)

            db.todoDao().todos().forEach {
                Log.d("Jamie", "${it.isComplete}")
                Log.d("Jamie", "${it.todoId}")
                Log.d("Jamie", "${it.todoItem}")
                Log.d("Jamie", "${it.todoPriority}")
            }
        }.start()

    }
}
