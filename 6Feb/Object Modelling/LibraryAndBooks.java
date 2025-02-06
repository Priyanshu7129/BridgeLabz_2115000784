import java.util.*;
class Book {
    String t, a;
    
    Book(String t, String a) {
        this.t = t;
        this.a = a;
    }
    void show() {
        System.out.println(t + " by " + a);
    }
}
class Library {
    List<Book> b_list = new ArrayList<>();

    void add(Book b) {
        b_list.add(b);
    }
    void show() {
        for (Book b : b_list) {
            b.show();
        }
    }
}
class LibraryAndBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int n = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < n; i++) {
            
            String t = sc.nextLine();
            
            String a = sc.nextLine();
            lib.add(new Book(t, a));
        }      
        lib.show();
        sc.close();
    }
}