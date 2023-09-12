package Chapter3.Exercises3.Task2.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private final String name;
    private static int membersIDs = 0;
    private final int memberID;
    List<Book> borrowedBooks;
    List<Book> reservedBooks;
    public LibraryMember(String name){
        this.memberID = ++membersIDs;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }
    public void addReservedBook(Book book){
        reservedBooks.add(book);
    }
    public boolean hasReservedBook(Book book){
        for (Book reservedBook : reservedBooks) {
            if (reservedBook.equals(book)) {
                return true;
            }
        }
        return false;
    }
    public void removeReservedBook(Book book){
        reservedBooks.remove(book);
    }
    public void getReservedBooks(){
        for (Book book : reservedBooks){
            System.out.println("Title: "+book.getTitle());
        }
    }
    /*
    public void removeReservedBook(Book book){
        for (Book reservedBook : reservedBooks){
            if (reservedBook.equals(book)){
                reservedBooks.remove(book);
                break;
            }
        }
    }*/
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
