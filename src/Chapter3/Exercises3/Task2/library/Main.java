package Chapter3.Exercises3.Task2.library;

import Chapter3.Exercises3.Task2.library.model.Book;
import Chapter3.Exercises3.Task2.library.model.LibraryMember;
import Chapter3.Exercises3.Task2.library.system.Library;

public class Main {
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
