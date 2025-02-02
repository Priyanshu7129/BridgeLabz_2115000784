import java.util.Scanner;
public class LibraryBooking {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String ISBN = sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();

        LibraryBooking book = new LibraryBooking();
        book.ISBN = ISBN;
        book.title = title;
        book.setAuthor(author);
        System.out.println("ISBN: " + book.ISBN + ", Title: " + book.title + ", Author: " + book.getAuthor());
    }
}
class EBook extends LibraryBooking {
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }
}