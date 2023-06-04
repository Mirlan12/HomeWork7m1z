package com.example.homework7m1z.domin.usecase

import com.example.homework7m1z.data.repository.NoteRepositoryImpl
import com.example.homework7m1z.domin.model.Note
import com.example.homework7m1z.domin.repository.NoteRepository
import javax.inject.Inject

class CreatNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {
    fun creatNote(note: Note) = noteRepository.createNote(note)
}