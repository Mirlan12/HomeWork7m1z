package com.example.homework7m1z.data.local

import androidx.room.*
import com.example.homework7m1z.data.model.NoteEntity

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes")
    fun getAllNotes(): List<NoteEntity>

    @Insert
    fun createNote(noteEntity: NoteEntity)

    @Update
    fun updeateNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)
}