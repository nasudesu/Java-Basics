package Chapter3.Exercises3.Task2.library.system;

import Chapter3.Exercises3.Task2.library.model.Book;
import Chapter3.Exercises3.Task2.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<LibraryMember> libraryMembers = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: "+book.getTitle());
    }
    public void addMember(LibraryMember member) {
        libraryMembers.add(member);
        System.out.println("Added member: "+member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        LibraryMember member1 = null;
        Book book1 = null;
        for (LibraryMember libraryMember : libraryMembers){
            if (libraryMember.equals(member)){
                member1 = libraryMember;
                break;
            }
        }
        for (Book books : books){
            if (books.equals(book)){
                book1 = book;
                break;
            }
        }
        assert member1 != null;
        member1.addBook(book1);
        books.remove(book1);
        assert book1 != null;
        System.out.println("Member: "+member1.getName()+" is borrowing: "+book1.getTitle());
    }
    public void returnBook(LibraryMember member, Book book) {
        books.add(book);
        member.removeBook();
        System.out.println("Member: "+member.getName()+" is returning: "+book.getTitle());
    }
    public void displayBorrowedBooks(){
        for (LibraryMember libraryMember : libraryMembers) {
            System.out.println(libraryMember.getName()+":");
            System.out.println(libraryMember.getBook().getTitle());
        }
    }
    public void displayLibraryBooks(){
        System.out.println("Library books: "+books.size());
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Stars","John W",1234);
        Book book2 = new Book("Moons","Walter W",4321);
        LibraryMember libraryMember1 = new LibraryMember("Markus");
        LibraryMember libraryMember2 = new LibraryMember("Jonne");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(libraryMember1);
        library.addMember(libraryMember2);
        library.displayLibraryBooks();

        library.borrowBook(libraryMember1,book1);
        library.borrowBook(libraryMember2,book2);
        library.displayBorrowedBooks();
        library.displayLibraryBooks();

        library.returnBook(libraryMember1,book1);
        library.returnBook(libraryMember2,book2);
        library.displayLibraryBooks();


    }
}
