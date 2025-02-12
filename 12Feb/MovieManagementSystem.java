import java.util.Scanner;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}
class MovieLinkedList {
    private Movie head, tail;

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
            return;
        }
        newMovie.next = head;
        head.prev = newMovie;
        head = newMovie;
    }
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
            return;
        }
        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
    }
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 1) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            addMovieAtEnd(title, director, year, rating);
            return;
        }
        newMovie.next = temp.next;
        temp.next.prev = newMovie;
        temp.next = newMovie;
        newMovie.prev = temp;
    }
    public void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
    }
    public void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }
    public void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year);
            }
            temp = temp.next;
        }
    }
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
    public void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }
}
public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();
        Scanner sc = new Scanner(System.in);
        movieList.addMovieAtEnd("Inception", "Nolan", 2010, 8.8);
        movieList.addMovieAtBeginning("Badass ravikumar", "Himesh bhai", 2025, 10.0);
        movieList.addMovieAtPosition("Niruhua rikshawala", "niruhua", 2009, 9.9, 2);
        movieList.displayForward();

        System.out.println("Enter Director to search: ");
        String director = sc.next();
        movieList.searchByDirector(director);

        System.out.println("Enter Movie Title to update rating: ");
        String title = sc.next();
        System.out.println("Enter new rating: ");
        double rating = sc.nextDouble();
        movieList.updateRating(title, rating);

        System.out.println("Movies in reverse order:");
        movieList.displayReverse();
    }
}
