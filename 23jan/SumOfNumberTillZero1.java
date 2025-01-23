import java.util.Scanner;
public class SumOfNumberTillZero1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double userInput;
        System.out.println("Enter numbers to add to the total (enter 0 to stop):");
        userInput = sc.nextDouble();
        while (userInput > 0) {
            total += userInput;
            userInput = sc.nextDouble();
        }
        System.out.println("The total sum is: " + total);
    }
}
