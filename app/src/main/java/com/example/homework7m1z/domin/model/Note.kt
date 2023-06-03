package com.example.homework7m1z.domin.model

import com.example.homework7m1z.data.model.NoteEntity

class Note(
    val id: NoteEntity = DEFAULT_ID,
    val title: String,
    val description: String,
){
    companion object{
        const val DEFAULT_ID = 0
    }

}