package com.example.monaxia1.adapters;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.monaxia1.R;
import com.example.monaxia1.entities.NoteClass;
import com.example.monaxia1.listeners.NotesListener;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder>{

    private List<NoteClass> noteClasses;
    private NotesListener notesListener;

    public NotesAdapter(List<NoteClass> noteClasses, NotesListener notesListener) {
        this.noteClasses = noteClasses;
        this.notesListener = notesListener;
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
    public void onBindViewHolder(@NonNull NoteViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.setNote(noteClasses.get(position));
        holder.layoutNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notesListener.onNoteClicked(noteClasses.get(position),position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return noteClasses.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle1, textSubtitle, textDateTime;
        LinearLayout layoutNote;

        NoteViewHolder(@NonNull View itemView){
            super(itemView);
            textTitle1 = itemView.findViewById(R.id.textTitle);
            textSubtitle = itemView.findViewById(R.id.textSubTitle);
            textDateTime = itemView.findViewById(R.id.textDateTime);
            layoutNote = itemView.findViewById(R.id.layoutNote);
        }

        void  setNote(NoteClass noteClass){
            textTitle1.setText(noteClass.getTitle());
            if(noteClass.getSubTitle().trim().isEmpty()){
                textSubtitle.setVisibility(View.GONE);
            } else{
                textSubtitle.setText(noteClass.getSubTitle());
            }
            textDateTime.setText(noteClass.getDatetime());

            GradientDrawable gradientDrawable = (GradientDrawable) layoutNote.getBackground();
            if(noteClass.getColor() != null){
                gradientDrawable.setColor(Color.parseColor(noteClass.getColor()));
            }
            else{
                gradientDrawable.setColor(Color.parseColor("#333333"));
            }
        }
    }

}