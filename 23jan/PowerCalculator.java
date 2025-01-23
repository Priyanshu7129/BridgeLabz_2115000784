import java.util.Scanner;
class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int baseNumber = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= baseNumber;
        }
        System.out.println(baseNumber + " raised to the power of " + power + " is: " + result);
    }
}