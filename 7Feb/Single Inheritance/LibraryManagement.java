class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Publication Year: " + publicationYear);
    }
}
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Author book = new Author("Half Girlfriend", 2014, "Chetan Bhagat", "Romantic Novel.");
        book.displayInfo();
    }
}
