package com.example.homework7m1z.data.mappers

import com.example.homework7m1z.data.model.NoteEntity
import com.example.homework7m1z.domin.model.Note

fun Note.toEntity() = NoteEntity(id, title, description)

fun NoteEntity.toNote() = Note(id, title, description)