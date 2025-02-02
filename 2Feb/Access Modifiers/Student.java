import java.util.Scanner;
public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }
    public double getCGPA() {
        return CGPA;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        Student student = new Student();
        student.rollNumber = rollNumber;
        student.name = name;
        student.setCGPA(cgpa);
        System.out.println("Roll Number: " + student.rollNumber + ", Name: " + student.name + ", CGPA: " + student.getCGPA());
    }
}
class PostgraduateStudent extends Student {
    public void displayDetails() {
        System.out.println("Name: " + name);
    }
}