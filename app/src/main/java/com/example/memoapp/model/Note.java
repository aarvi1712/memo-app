package com.example.memoapp.model;

public class Note {

    private String noteText;
    private long date;

    public Note(String noteText, long date) {
        this.noteText = noteText;
        this.date = date;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
