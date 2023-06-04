package com.example.homework7m1z.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.homework7m1z.data.local.NoteDao
import com.example.homework7m1z.data.local.NoteDatabase
import com.example.homework7m1z.data.repository.NoteRepositoryImpl
import com.example.homework7m1z.domin.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object NoteModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext context: Context
    ) : NoteDatabase = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "note_dp"
    ).allowMainThreadQueries().build()

    @Singleton
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideNoteRepository (NoteDao: NoteDao): NoteRepository = NoteRepositoryImpl(NoteDao)
}