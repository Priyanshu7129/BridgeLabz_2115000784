import java.util.*;
class Company {
    String n;
    List<Department> dpts = new ArrayList<>();

    Company(String n) {
        this.n = n;
    }
    void addDept(Department d) {
        dpts.add(d);
    }
    void removeDepts() {
        dpts.clear();
    }
    void delCompany() {
        System.out.println("Deleting company: " + n);
        removeDepts();
    }
}
class Department {
    String n;
    List<Employee> emps = new ArrayList<>();

    Department(String n) {
        this.n = n;
    }
    void addEmp(Employee e) {
        emps.add(e);
    }
    void removeEmps() {
        emps.clear();
    }
    void showEmps() {
        for (Employee e : emps) {
            System.out.println("Emp in " + n + ": " + e.n);
        }
    }
}
class Employee {
    String n;
    Employee(String n) {
        this.n = n;
    }
}
class CompanyAndDepartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String companyName = sc.nextLine();
        Company c = new Company(companyName);
        int deptCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < deptCount; i++) {
            String deptName = sc.nextLine();
            Department dept = new Department(deptName);

            System.out.print("Enter number of employees in " + deptName + ": ");
            int empCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < empCount; j++) {
                String empName = sc.nextLine();
                Employee emp = new Employee(empName);
                dept.addEmp(emp);
            }
            c.addDept(dept);
        }
        System.out.println("\nBefore company deletion:");
        for (Department dept : c.dpts) {
            dept.showEmps();
        }
        c.delCompany();
        System.out.println("\nAfter company deletion:");
        for (Department dept : c.dpts) {
            dept.showEmps();
        }
        sc.close();
    }
}