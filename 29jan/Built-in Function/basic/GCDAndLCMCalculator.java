import java.util.Scanner;
public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        displayResult(num1, num2, gcd, lcm);
    }
    private static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private static int calculateLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }
    private static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd + ".");
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm + ".");
    }
}
