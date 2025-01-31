class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("2 States", "Chetan Bhagat", 200);
        book.displayDetails();
    }
}