package com.example.monaxia1.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.monaxia1.R;
import com.example.monaxia1.adapters.NotesAdapter;
import com.example.monaxia1.database.NotesDatabase;
import com.example.monaxia1.entities.NoteClass;
import com.example.monaxia1.listeners.NotesListener;

import java.util.ArrayList;
import java.util.List;

public class NoteFunction extends AppCompatActivity implements NotesListener {

    public  static final int REQUEST_CODE_ADD_NOTE = 1;
    public static final int REQUEST_CODE_UPDATE_NOTE = 2;
    public static final int REQUEST_CODE_SHOW_NOTES =3;

    private RecyclerView notesRecyclerView;
    private List<NoteClass> noteList;
    private NotesAdapter notesAdapter;


    private int noteClickedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_function);

        ImageView imageAddNoteMain = findViewById(R.id.imageAddNote);
        imageAddNoteMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(
                        new Intent(getApplicationContext(), CreateNoteActivity.class),
                        REQUEST_CODE_ADD_NOTE
                );
            }
        });

        notesRecyclerView = findViewById(R.id.notesRecyclerV);
        notesRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        noteList = new ArrayList<>();
        notesAdapter = new NotesAdapter(noteList, this);
        notesRecyclerView.setAdapter(notesAdapter);


        getNotes(REQUEST_CODE_SHOW_NOTES,false);

    }

    @Override
    public void onNoteClicked(NoteClass noteClass, int position) {
        noteClickedPosition = position;
        Intent intent = new Intent(getApplicationContext(), CreateNoteActivity.class);
        intent.putExtra("isViewOrUpdate", true);
        intent.putExtra("note", noteClass);
        startActivityForResult(intent, REQUEST_CODE_UPDATE_NOTE);
    }

    private void getNotes(final int requestCode, final boolean isNoteDeleted) {


            @SuppressLint("StaticFieldLeak")
            class GetNotesTask extends AsyncTask<Void, Void, List<NoteClass>> {
                @Override
                protected List<NoteClass> doInBackground(Void... voids) {
                    return NotesDatabase
                            .getDatabase(getApplicationContext())
                            .noteDao().getAllNotes();
                }

                @Override
                protected void onPostExecute(List<NoteClass> noteClasses) {
                    super.onPostExecute(noteClasses);
                    if (requestCode == REQUEST_CODE_SHOW_NOTES){
                        noteList.addAll(noteClasses);
                        notesAdapter.notifyDataSetChanged();
                    }else if(requestCode == REQUEST_CODE_ADD_NOTE){
                        noteList.add(0, noteClasses.get(0));
                        notesAdapter.notifyItemInserted(0);
                        notesRecyclerView.smoothScrollToPosition(0);
                    }else if (requestCode == REQUEST_CODE_UPDATE_NOTE){
                        noteList.remove(noteClickedPosition);
                        if(isNoteDeleted){
                            notesAdapter.notifyItemRemoved(noteClickedPosition);
                        }
                        else{
                            noteList.add(noteClickedPosition, noteClasses.get(noteClickedPosition));
                            notesAdapter.notifyItemChanged(noteClickedPosition);
                        }
                    }
                }

            }
            new GetNotesTask().execute();
        }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_ADD_NOTE && resultCode == RESULT_OK){
            getNotes(REQUEST_CODE_ADD_NOTE, false);
        }
        else if(requestCode == REQUEST_CODE_UPDATE_NOTE && resultCode == RESULT_OK);
        if(data != null){
            getNotes(REQUEST_CODE_UPDATE_NOTE, data.getBooleanExtra("isNoteDeleted",false));
        }
    }
}