package com.example.homework7m1z.domin.usecase

import com.example.homework7m1z.data.model.NoteEntity
import com.example.homework7m1z.domin.model.Note

class NoteEntitiExtension {
    fun List<NoteEntity>.toNoteList(): List<Note> {
        return map { noteEntity ->
            Note(
                id = noteEntity.id,
                title = noteEntity.title,
                description = noteEntity.description
            )
        }
    }
}