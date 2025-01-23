import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();

        double bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05;
        }
        System.out.printf("The bonus amount is: %.2f%n", bonusAmount);
    }
}