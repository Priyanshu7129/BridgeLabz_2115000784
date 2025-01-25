import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double totalBonus = 0.0;
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] < 0 || salaries[i] < 0) {
                System.out.println("Invalid input.");
                i--;
            }
        }       
        for (int i = 0; i < salaries.length; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            totalBonus += bonuses[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
    }
}