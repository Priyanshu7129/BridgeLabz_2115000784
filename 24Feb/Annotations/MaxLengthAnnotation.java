import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}
class User1 {
    @MaxLength(10)
    private String username;
    
    public User1(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username exceeds maximum length");
        }
        this.username = username;
    }   
    public String getUsername() {
        return username;
    }
}
public class MaxLengthAnnotation {
    public static void main(String[] args) {
        try {
            User1 user = new User1("JohnDoe12345"); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        User1 validUser = new User1("JaneDoe");
        System.out.println("Valid username: " + validUser.getUsername());
    }
}
