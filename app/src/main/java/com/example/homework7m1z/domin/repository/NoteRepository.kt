package com.example.homework7m1z.domin.repository

import com.example.homework7m1z.domin.model.Note

interface NoteRepository {

    fun getAllNotes(): List<Note>

    fun createNote(note: Note)

    fun updateNote(note: Note)

    fun deleteNote(note: Note)


}