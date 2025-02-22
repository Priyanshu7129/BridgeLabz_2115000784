import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistration {
    public void registerUser(String username, String email, String password) {
        if (username == null || email == null || password == null || username.isEmpty() ||
                !email.contains("@") || !PasswordValidator.isValid(password)) {
            throw new IllegalArgumentException("Invalid user details");
        }
    }
}

public class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        UserRegistration registration = new UserRegistration();
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john@example.com", "StrongPass1"));
    }
    
    @Test
    void testInvalidUserRegistration() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "email@test.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("User", "emailtest.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("User", "email@test.com", "weak"));
    }
}
