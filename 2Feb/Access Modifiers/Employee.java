import java.util.Scanner;
public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter department: ");
        String department = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee();
        employee.employeeID = employeeID;
        employee.department = department;
        employee.setSalary(salary);
        System.out.println("Employee ID: " + employee.employeeID + ", Department: " + employee.department + ", Salary: " + employee.getSalary());
    }
}
class Manager extends Employee {
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department);
    }
}