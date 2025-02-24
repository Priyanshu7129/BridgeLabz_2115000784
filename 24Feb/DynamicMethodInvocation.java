import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter method name (add/subtract/multiply):");
        String methodName = scanner.nextLine();
        
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println("Result: " + method.invoke(obj, 5, 3));
    }
}
