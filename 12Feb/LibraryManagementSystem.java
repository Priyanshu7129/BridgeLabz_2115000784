import java.util.Scanner;
class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    public Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}
class Library {
    private Book head, tail;
    private int totalBooks;

    public void addBookAtBeginning(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }
    public void addBookAtEnd(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }
    public void addBookAtPosition(int bookId, String title, String author, String genre, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(bookId, title, author, genre, isAvailable);
            return;
        }
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        Book temp = head;
        int index = 1;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }
        if (temp == null || temp.next == null) {
            addBookAtEnd(bookId, title, author, genre, isAvailable);
            return;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
        totalBooks++;
    }
    public void removeBook(int bookId) {
        if (head == null) return;
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            totalBooks--;
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp == tail) tail = temp.prev;
        totalBooks--;
    }
    public Book searchBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) return temp;
            temp = temp.next;
        }
        return null;
    }
    public Book searchBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void updateAvailability(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                return;
            }
            temp = temp.next;
        }
    }
    public void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + 
                               ", Genre: " + temp.genre + ", Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
    }
    public void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + 
                               ", Genre: " + temp.genre + ", Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
    }
    public int getTotalBooks() {
        return totalBooks;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBookAtEnd(1, "Harry Potter", "JK Rowling", "Fiction", true);
        library.addBookAtBeginning(2, "Mathematics", "RD sharma", "academics", true);
        library.addBookAtEnd(3, "Intoduction to physics", "HC verma", "Physics", false);
        library.addBookAtPosition(4, "Panchatantra", "Vishnu sharma", "fantasy", true, 2);

        System.out.println("Books in Forward Order:");
        library.displayBooksForward();

        System.out.println("\nBooks in Reverse Order:");
        library.displayBooksReverse();

        System.out.println("\nTotal Books: " + library.getTotalBooks());

        System.out.println("\nSearching for book by title '1984':");
        Book found = library.searchBookByTitle("1984");
        if (found != null) {
            System.out.println("Found - Book ID: " + found.bookId + ", Author: " + found.author);
        }

        System.out.println("\nUpdating availability of Book ID 3 to available.");
        library.updateAvailability(3, true);
        library.displayBooksForward();

        System.out.println("\nRemoving Book ID 2.");
        library.removeBook(2);
        library.displayBooksForward();

        System.out.println("\nTotal Books after removal: " + library.getTotalBooks());
    }
}
