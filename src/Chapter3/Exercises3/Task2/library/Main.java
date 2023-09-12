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


        //Task2
        //library.addBook(book1);
        //library.addMember(libraryMember1);
        //library.displayLibraryBooks();
        //library.borrowBook(libraryMember1,book1);
        //library.displayBorrowedBooks();
        //library.displayLibraryBooks();
        //library.returnBook(libraryMember1,book1);
        //library.displayLibraryBooks();

        //Task3
        //library.reserveBook(libraryMember1,book1);
        //library.displayReservedBooks(libraryMember1);
        //library.cancelReservation(libraryMember1,book1);
        //library.displayReservedBooks(libraryMember1);


    }
}
