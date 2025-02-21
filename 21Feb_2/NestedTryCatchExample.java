import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = scanner.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                int result = numbers[index] / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            scanner.close();
        }
    }
}
