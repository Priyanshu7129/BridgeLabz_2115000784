import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        System.out.println("The result is: " + result);
    }
    private static double add(double num1, double num2) {
        return num1 + num2;
    }
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
