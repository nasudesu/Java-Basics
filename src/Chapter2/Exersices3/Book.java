package Chapter2.Exersices3;

public class Book {

    private String title;
    private String author;
    private String publication_yer;
    private double review;
    private double rating;
    Book(String title,String author,String publication_yer){
        this.title = title;
        this.author = author;
        this.publication_yer = publication_yer;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setReview(double review) {
        this.review = review;
    }
    public double getRating() {
        return rating;
    }
    public double getReview() {
        return review;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublication_yer() {
        return publication_yer;
    }
    public String getTitle() {
        return title;
    }
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author+"\nYear: "+publication_yer;
    }
}
