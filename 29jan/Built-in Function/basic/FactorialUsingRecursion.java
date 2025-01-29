import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int number = getInput();
        int result = calculateFactorial(number);
        displayResult(number, result);
    }
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return sc.nextInt();
    }
    private static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
    private static void displayResult(int number, int result) {
        System.out.println("The factorial of " + number + " is " + result + ".");
    }
}
