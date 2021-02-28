package com.kiranpuppala.jetpacktodo.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "task_table")
@Parcelize
data class Task(
    val name:String,
    val completed:Boolean,
    val created:Long = System.currentTimeMillis(),
    @PrimaryKey(autoGenerate = true) val id:Int = 0
):Parcelable