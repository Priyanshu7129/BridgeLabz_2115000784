import java.util.Scanner;
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public void borrowBook() {
        if (available) {
            available = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        LibraryBook book = new LibraryBook(title, author, price);
        book.borrowBook();
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Price: " + book.price + ", Available: " + book.available);
    }
}