package com.example.monaxia1.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monaxia1.R;
import com.example.monaxia1.entities.Notes;
import com.example.monaxia1.listeners.NotesListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import io.realm.Realm;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {
    Context context;
    private List<Notes>  notes;
    private NotesListener notesListener;
    private Timer timer;
    private List<Notes> noteSource;

    public NotesAdapter(List<Notes> noteClasses, NotesListener notesListener) {
        this. notes = noteClasses;
        this.notesListener = notesListener;
        noteSource = noteClasses;
    }


    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new NoteViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_note,
                        parent,
                        false
                )
        );
    }


    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.setNote( notes.get(position = holder.getAdapterPosition()));
        int finalPosition = position;
        holder.layoutNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notesListener.onNoteClicked( notes.get(finalPosition), finalPosition);
            }
        });

     holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
         @Override
         public boolean onLongClick(View v) {

             PopupMenu menu = new PopupMenu(context, v);
             menu.getMenu().add("DELETE");
             menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                 @Override
                 public boolean onMenuItemClick(MenuItem item) {
                    if(item.getTitle().equals("DELETE")){
                        Realm realm = Realm.getDefaultInstance();
                        realm.beginTransaction();
                        notes.remove(0);
                        realm.commitTransaction();
                    }

                     return true;
                 }
             });
             menu.show();

             return true;
         }
     });

    }


    @Override
    public int getItemCount() {
        return  notes.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle1, textSubtitle, textDateTime;
        LinearLayout layoutNote;

        NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle1 = itemView.findViewById(R.id.textTitle);
            textSubtitle = itemView.findViewById(R.id.textSubTitle);
            textDateTime = itemView.findViewById(R.id.textDateTime);
            layoutNote = itemView.findViewById(R.id.layoutNote);
        }

        void setNote(Notes noteClass) {
            textTitle1.setText(noteClass.getTitle());
            if (noteClass.getSubTitle().trim().isEmpty()) {
                textSubtitle.setVisibility(View.GONE);
            } else {
                textSubtitle.setText(noteClass.getSubTitle());
            }
            textDateTime.setText(noteClass.getDatetime());

            GradientDrawable gradientDrawable = (GradientDrawable) layoutNote.getBackground();
            if (noteClass.getColor() != null) {
                gradientDrawable.setColor(Color.parseColor(noteClass.getColor()));
            } else {
                gradientDrawable.setColor(Color.parseColor("#333333"));
            }
        }
    }

    public void searchNotes(final String searchKeyword) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (searchKeyword.trim().isEmpty()) {
                    notes = noteSource;
                } else {
                    ArrayList<Notes> temp = new ArrayList<>();
                    for (Notes noteClass : noteSource) {
                        if (noteClass.getTitle().toLowerCase().contains(searchKeyword.toLowerCase())
                                || noteClass.getSubTitle().toLowerCase().contains(searchKeyword.toLowerCase())
                                || noteClass.getNoteText().toLowerCase().contains(searchKeyword.toLowerCase())) {
                            temp.add(noteClass);
                        }
                    }
                    notes = temp;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        notifyDataSetChanged();
                    }
                });
            }
        }, 500);
    }

    public void cancelTimer(){
        if(timer != null){
            timer.cancel();
        }
    }
}