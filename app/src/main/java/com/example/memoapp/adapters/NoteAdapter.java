package com.example.memoapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memoapp.R;
import com.example.memoapp.model.Note;
import com.example.memoapp.utily.NotesUtils;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteHolder> {


        private ArrayList<Note> note;
    public void setNote(ArrayList<Note> note) {
        this.note = note;
    }


    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_layout,parent,false);
        return new NoteHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
      Note note=getNotes(position);
      if(note !=null)
      {
          holder.noteText.setText(note.getNoteText());
          holder.noteDate.setText(NotesUtils.DatefLong(note.getDate()));
      }

    }

    @Override
    public int getItemCount() {
        return note.size();
    }
        private Note getNotes(int position)
        {
            return note.get(position);
        }


    class NoteHolder extends RecyclerView.ViewHolder
    {
        TextView noteText ,noteDate;
        public NoteHolder(View itemView)
        {
            super(itemView);
        }

    }
}
