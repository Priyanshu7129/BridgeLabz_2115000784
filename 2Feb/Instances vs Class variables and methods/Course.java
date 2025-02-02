import java.util.Scanner;
public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + ", Fee: " + fee);
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter duration (months): ");
        int duration = sc.nextInt();
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        Course course = new Course(courseName, duration, fee);
        course.displayCourseDetails();
        System.out.print("Enter new institute name: ");
        sc.nextLine(); 
        String newName = sc.nextLine();
        Course.updateInstituteName(newName);
        System.out.println("Institute Name: " + Course.instituteName);
    }
}