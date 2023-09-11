package Chapter3.Exercises3.Task2.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private final String name;
    private static int membersIDs = 0;
    private final int memberID;
    List<Book> borrowedBooks;
    public LibraryMember(String name){
        this.memberID = ++membersIDs;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public int getMemberID() {
        return this.memberID;
    }
    public String getName() {
        return name;
    }
    public void addBook(Book book){
        borrowedBooks.add(book);
    }
    public Book getBook(){
        return borrowedBooks.get(0);
    }
    public void removeBook(){
        borrowedBooks.remove(0);
    }

}
