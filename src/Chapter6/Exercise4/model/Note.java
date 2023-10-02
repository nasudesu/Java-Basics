package Chapter6.Exercise4.model;

public class Note {
private String title;
    private String content;

    public Note() {
        this.title = "";
        this.content = "";
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nContent: " + content;
    }
}
