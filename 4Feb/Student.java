import java.util.Scanner;
public class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        Student student = new Student(name, rollNumber, grade);
        student.displayStudentDetails();

        System.out.print("Enter new grade for the student: ");
        String newGrade = sc.nextLine();
        student.updateGrade(newGrade);

        System.out.println("Updated Student Details:");
        student.displayStudentDetails();

        displayTotalStudents();
    }
}