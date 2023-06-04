package com.example.homework7m1z.domin.usecase

import com.example.homework7m1z.domin.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {
    fun deleteNote(noteId: String) = noteRepository.deleteNoteById(noteId)
}
