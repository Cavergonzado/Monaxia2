package com.example.monaxia1.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.monaxia1.entities.NoteClass;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<NoteClass> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(NoteClass noteClass);

    @Delete
    void deleteNote(NoteClass noteClass);

}
