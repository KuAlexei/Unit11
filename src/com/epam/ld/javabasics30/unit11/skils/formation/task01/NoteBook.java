package com.epam.ld.javabasics30.unit11.skils.formation.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NoteBook {
    private List<Note> notes = new ArrayList<Note>();
    public NoteBook() {
    }
    public List<Note> getNotes(){
        return notes;
    }
    public void add(Note note){
        notes.add(note);
    }
    public boolean delete(Note note){
        return notes.remove(note);
    }

    public Note findByContent(String content){
        for(Note note : notes){
            if (note.getNote().equals(content)){
                return note;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "NoteBook{" + "notes=" + notes + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return notes.equals(noteBook.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }
}
