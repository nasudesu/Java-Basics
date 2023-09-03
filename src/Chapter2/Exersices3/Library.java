package Chapter2.Exersices3;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Book> borrowed = new ArrayList<>();
    public ArrayList<User> users = new ArrayList<>();
    void addBook(Book book){
        books.add(book);
    }
    public double getAverageRatings() {
        double ratings = 0;
        for (Book book : books) {
            ratings += book.getRating();
        }
        return ratings/books.size();
    }
    public double getMaxReviews() {
        double max_review = 0;
        for (Book book : books) {
            if (book.getReview() > max_review) {
                max_review = book.getReview();
            }
        }
        return max_review;
    }
    void displayBooks(){
        for (Book book : books) {
            System.out.println(book.toString());
            System.out.println();
        }
    }
    void findBooksByAuthor(String author){
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Books by :" + book.getAuthor());
                System.out.println("Tittle: " + book.getTitle());
                System.out.println("Year: : " + book.getPublication_yer());
            }
        }
    }
    Book findBooksByTitle(String title){
        Book borrowed_book = null;
        for (Book book : borrowed) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                borrowed_book = book;
                break;
            }
        }
       return borrowed_book;
    }
    void borrowBook(String title){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                borrowed.add(books.get(i));
                books.remove(i);
                break;
            }
        }
    }
    void returnBook(String title){
        for (int i = 0; i < borrowed.size(); i++) {
            if (borrowed.get(i).getTitle().equalsIgnoreCase(title)){
                books.add(borrowed.get(i));
                borrowed.remove(i);
                break;
            }
        }
    }
    boolean isBookAvailable(String title){
        boolean available = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                available = true;
                break;
            }
        }
        return available;
    }
    void addUser(String a,int b){
        users.add(new User(a,b));
    }
    void userBorrow(String title, String name){
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).name.equalsIgnoreCase(name)){
                user = users.get(i);
                break;
            }
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                assert user != null;
                user.user_borrowed.add(books.get(i));
                books.remove(i);
                break;
            }
        }
    }
    void checkUserBooks(String name){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).name.equalsIgnoreCase(name)){
                for (int j = 0; j < users.get(i).user_borrowed.size(); j++) {
                    System.out.println(users.get(i).user_borrowed.get(j).toString());
                }
            }
        }
    }
}
