package com.example.homework7m1z.domin.usecase

import com.example.homework7m1z.domin.repository.NoteRepository

class GetAllNotesUseCase(
    private val noteRepository: NoteRepository
) {

    fun getAllNotes() = noteRepository.getAllNotes()
}