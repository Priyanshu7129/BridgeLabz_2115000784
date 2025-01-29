import java.util.Scanner;
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getInput(sc, "Enter the first number: ");
        int num2 = getInput(sc, "Enter the second number: ");
        int num3 = getInput(sc, "Enter the third number: ");
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }
    private static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
    private static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
