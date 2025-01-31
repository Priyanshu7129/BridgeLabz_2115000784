class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
public class EmployeeProgram {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Priyanshu Kumar", 100, 50000);
        employee1.displayDetails();
    }
}