package com.example.homework7m1z.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NoteDatabase:: class], version = 1)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDao

}