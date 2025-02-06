import java.util.*;
class University {
    String n;
    List<Department> d = new ArrayList<>();

    University(String n) {
        this.n = n;
    }
    void addD(Department dept) {
        d.add(dept);
    }
    void remD(Department dept) {
        d.remove(dept);
    }
    void showD() {
        System.out.println("D in " + n + ":");
        for (Department dept : d) {
            System.out.println("D: " + dept.n);
        }
    }
    void delU() {
        d.clear();
    }
}
class Department {
    String n;
    List<Faculty> f = new ArrayList<>();

    Department(String n) {
        this.n = n;
    }
    void addF(Faculty faculty) {
        f.add(faculty);
    }
    void showF() {
        System.out.println("F in " + n + " D:");
        for (Faculty faculty : f) {
            System.out.println("F: " + faculty.n);
        }
    }
}
class Faculty {
    String n;

    Faculty(String n) {
        this.n = n;
    }
    void showFD() {
        System.out.println("F: " + n);
    }
}
public class FacultiesAndDepartments {
    public static void main(String[] args) {
        University u = new University("Tech U");
        Department d1 = new Department("CS");
        Department d2 = new Department("EE");
        Faculty f1 = new Faculty("Dr. J");
        Faculty f2 = new Faculty("Dr. E");
        d1.addF(f1);
        d2.addF(f2);
        u.addD(d1);
        u.addD(d2);
        u.showD();
        d1.showF();
        d2.showF();
        u.delU();
        u.showD();
        f1.showFD();
        f2.showFD();
    }
}