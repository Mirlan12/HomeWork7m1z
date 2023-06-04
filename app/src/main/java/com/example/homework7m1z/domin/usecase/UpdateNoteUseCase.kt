package com.example.homework7m1z.domin.usecase

import com.example.homework7m1z.domin.model.Note
import com.example.homework7m1z.domin.repository.NoteRepository
import javax.inject.Inject

class UpdateNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {
    fun updateNote(note: Note) = noteRepository.updateNote(note)
}
