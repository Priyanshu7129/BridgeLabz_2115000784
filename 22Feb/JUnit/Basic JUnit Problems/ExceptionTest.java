import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionTest {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    @Test
    void testDivideByZero() {
        ExceptionTest obj = new ExceptionTest();
        assertThrows(ArithmeticException.class, () -> obj.divide(10, 0));
    }
}
