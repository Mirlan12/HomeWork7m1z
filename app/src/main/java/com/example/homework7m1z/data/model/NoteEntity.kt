package com.example.homework7m1z.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: NoteEntity,
    val title: String,
    val description: String,


    )