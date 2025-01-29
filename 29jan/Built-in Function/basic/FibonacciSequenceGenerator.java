import java.util.Scanner;
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = sc.nextInt();
        generateFibonacciSequence(n);
    }
    private static void generateFibonacciSequence(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Sequence: " + firstTerm + ", " + secondTerm);

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
