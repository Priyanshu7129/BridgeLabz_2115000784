import java.util.Scanner;
public class SumOfNumberTillZero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        System.out.println("Enter numbers to add to the total (enter 0 or a negative number to stop):");
        while (true) {
            userInput = sc.nextDouble();
            if (userInput <= 0) {
                break;
            }
            total += userInput;
        }
        System.out.println("The total sum is: " + total);
    }
}
