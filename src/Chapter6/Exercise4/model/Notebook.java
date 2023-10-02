package Chapter6.Exercise4.model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public void addNote(String title, String content) {
        notes.add(new Note(title, content));
    }

    public Note getNoteByTitle(String title) {
        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                return note;
            }
        }
        return null;
    }

}
