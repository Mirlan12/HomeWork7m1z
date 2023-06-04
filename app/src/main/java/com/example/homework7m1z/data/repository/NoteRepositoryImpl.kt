package com.example.homework7m1z.data.repository

import com.example.homework7m1z.data.local.NoteDao
import com.example.homework7m1z.data.mappers.toEntity
import com.example.homework7m1z.data.mappers.toNote
import com.example.homework7m1z.data.model.NoteEntity
import com.example.homework7m1z.di.NoteModule
import com.example.homework7m1z.domin.model.Note
import com.example.homework7m1z.domin.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
): NoteRepository {
    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map{ it.toNote()}
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