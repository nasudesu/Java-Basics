package Chapter2.Exersices3;

public class LibraryMain {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Introduction to Java Programming","John Smith","2020");
        Book book2 = new Book("Data Structures and Algorithms","Jane Doe","2018");
        Book book3 = new Book("The Art of Fiction","Alice Johnson","2019");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //Task1
        //library.displayBooks();
        //library.findBooksByAuthor("alice johnson");

        //Task2
        //library.borrowBook("The Art of Fiction");
        //library.displayBooks();
        //System.out.println("--------------------------");
        //library.returnBook("The Art of Fiction");
        //library.displayBooks();

        //Task3
        //library.borrowBook("The Art of Fiction");
        //System.out.println(library.isBookAvailable("The Art of Fiction"));
        //library.returnBook("The Art of Fiction");
        //System.out.println(library.isBookAvailable("The Art of Fiction"));

        //Task4
        //book1.setRating(8);
        //book1.setReview(700);
        //book2.setRating(5);
        //book2.setReview(300);
        //book3.setRating(3);
        //book3.setReview(100);
        //System.out.println(book1.getRating());
        //System.out.println(book1.getReview());
        //System.out.println(book2.getRating());
        //System.out.println(book2.getReview());
        //System.out.println(book3.getRating());
        //System.out.println(book3.getReview());

        //Task5
        //book1.setRating(8);
        //book1.setReview(700);
        //book2.setRating(5);
        //book2.setReview(300);
        //book3.setRating(3);
        //book3.setReview(100);
        //System.out.println(library.getAverageRatings());
        //System.out.println(library.getMaxReviews());

        //Task6
        //library.addUser("Markku",20);
        //library.addUser("Pekka",25);
        //library.userBorrow("The Art of Fiction","Markku");
        //library.userBorrow("Introduction to Java Programming","Pekka");
        //library.checkUserBooks("pekka");
        //System.out.println("-------------------------");
        //library.checkUserBooks("markku");




    }
}
