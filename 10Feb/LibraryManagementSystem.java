abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public abstract int getLoanDuration();

    public String getItemDetails() {
        return title + " by " + author;
    }
}
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() {
        return 14;
    }
}
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() {
        return 7;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B123", "Java Programming", "John Smith"),
            new Magazine("M456", "Tech Today", "Alice Johnson")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + " - Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
