import java.util.*;
class Course {
    String c_name;
    Professor prof;
    List<Student> students = new ArrayList<>();

    Course(String c_name) {
        this.c_name = c_name;
    }
    void assignProf(Professor p) {
        prof = p;
    }
    void enrollStudent(Student s) {
        students.add(s);
    }
    void showCourseDetails() {
        System.out.println("Course: " + c_name);
        System.out.println("Professor: " + prof.p_name);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.s_name);
        }
    }
}
class Student {
    String s_name;

    Student(String s_name) {
        this.s_name = s_name;
    }
    void enrollCourse(Course c) {
        c.enrollStudent(this);
    }
}
class Professor {
    String p_name;

    Professor(String p_name) {
        this.p_name = p_name;
    }
    void assignCourse(Course c) {
        c.assignProf(this);
    }
}
class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p_name = sc.nextLine();
        Professor prof = new Professor(p_name);
        String c_name = sc.nextLine();
        Course c = new Course(c_name);

        prof.assignCourse(c);

        System.out.print("Enter number of students for " + c_name + ": ");
        int s_count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < s_count; i++) {
            String s_name = sc.nextLine();
            Student s = new Student(s_name);
            s.enrollCourse(c);
        }

        c.showCourseDetails();
        sc.close();
    }
}