package Chapter3.Exercises3.Task2.library.model;

public class Book {
    private final String title;
    private final String author;
    private final int ISBN;
    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }
}
