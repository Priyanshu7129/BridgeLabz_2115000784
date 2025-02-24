import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class Document {}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        Author author = Document.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}
