import java.util.*;
public class EmployeeBonusCalculator{
    public static void main(String[] args) {
        int numberOfEmployees = 10;
        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displayResults(employeeData, updatedData);
    }
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numberOfEmployees][2]; 
        for (int i = 0; i < numberOfEmployees; i++) {
            double salary = 10000 + (random.nextDouble() * 90000);
            double yearsOfService = 1 + random.nextInt(20);
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; 
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }
            double newSalary = oldSalary + bonus;
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }
    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.printf("%-10s %-15s %-15s %-15s%n", "Employee", "Old Salary", "New Salary", "Bonus");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n", (i + 1), oldSalary, newSalary, bonus);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f%n", "Total", totalOldSalary, totalNewSalary, totalBonus);
    }

}