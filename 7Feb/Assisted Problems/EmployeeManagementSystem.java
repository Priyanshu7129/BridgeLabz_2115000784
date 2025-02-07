class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    int duration; 

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, Duration: " + duration + " months");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("pk", 101, 90000, 10);
        Employee developer = new Developer("vushu", 102, 75000, "Java");
        Employee intern = new Intern("devu", 103, 30000, 6);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
