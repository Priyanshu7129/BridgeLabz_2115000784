import java.util.*;
class School {
    String n;
    List<Student> stds = new ArrayList<>();

    School(String n) {
        this.n = n;
    }
    void addStd(Student s) {
        stds.add(s);
    }
    void showStudents() {
        for (Student s : stds) {
            System.out.println("Student: " + s.n);
        }
    }
}
class Student {
    String n;
    List<Course> crs = new ArrayList<>();

    Student(String n) {
        this.n = n;
    }
    void enroll(Course c) {
        crs.add(c);
        c.addStd(this);
    }
    void showCourses() {
        for (Course c : crs) {
            System.out.println("Course: " + c.n);
        }
    }
}
class Course {
    String n;
    List<Student> stds = new ArrayList<>();

    Course(String n) {
        this.n = n;
    }
    void addStd(Student s) {
        stds.add(s);
    }
    void showStudents() {
        for (Student s : stds) {
            System.out.println("Student enrolled: " + s.n);
        }
    }
}
class SchoolAndStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String schoolName = sc.nextLine();
        School sch = new School(schoolName);

        int stdCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < stdCount; i++) {

            String studentName = sc.nextLine();
            Student std = new Student(studentName);

            System.out.print("Enter number of courses for " + studentName + ": ");
            int courseCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < courseCount; j++) {

                String courseName = sc.nextLine();
                Course crs = new Course(courseName);
                std.enroll(crs);
            }
            sch.addStd(std);
        }
        System.out.println("\nSchool Students:");
        sch.showStudents();
        System.out.println("\nCourses and Enrolled Students:");
        for (Student std : sch.stds) {
            std.showCourses();
        }
        sc.close();
    }
}