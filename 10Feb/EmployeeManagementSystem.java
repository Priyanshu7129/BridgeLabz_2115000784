abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: $" + calculateSalary());
    }
    public double getBaseSalary() {
        return baseSalary;
    }
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("100", "PK", 5000);
        Employee e2 = new PartTimeEmployee("101", "DK", 20, 80);

        e1.displayDetails();
        e2.displayDetails();
    }
}
