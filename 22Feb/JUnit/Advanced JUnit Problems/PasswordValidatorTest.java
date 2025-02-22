import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidator {
    public static boolean isValid(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}
public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongP@ss1"));
    }
    
    @Test
    void testInvalidPassword() {
        assertFalse(PasswordValidator.isValid("weak"));
    }
}
