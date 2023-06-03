package com.example.homework7m1z.data.repository

import com.example.homework7m1z.data.local.NoteDao
import com.example.homework7m1z.data.mappers.toEntity
import com.example.homework7m1z.data.model.NoteEntity
import com.example.homework7m1z.domin.model.Note
import com.example.homework7m1z.domin.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NoteRepository {
    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes()
    }

    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun updateNote(note: Note) {
        noteDao.updeateNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }
}