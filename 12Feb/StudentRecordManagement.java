import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList {
    private Student head;

    public void addStudentAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    public void addStudentAtEnd(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }
    public void addStudentAtPosition(int rollNumber, String name, int age, char grade, int position) {
        if (position <= 0) {
            addStudentAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }
    public void deleteStudentByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    public Student searchStudentByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void updateStudentGrade(int rollNumber, char newGrade) {
        Student student = searchStudentByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }
    public void displayAllStudents() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}
public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);
        
        studentList.addStudentAtEnd(1, "Priyanshu", 20, 'A');
        studentList.addStudentAtEnd(2, "Vishal", 21, 'B');
        studentList.addStudentAtBeginning(3, "Devansh", 22, 'C');
        studentList.displayAllStudents();
        
        System.out.println("Enter Roll Number to Search: ");
        int rollNumber = scanner.nextInt();
        Student found = studentList.searchStudentByRollNumber(rollNumber);
        if (found != null) {
            System.out.println("Found: " + found.name + " " + found.age + " " + found.grade);
        } else {
            System.out.println("Student Not Found");
        }
        System.out.println("Enter Roll Number to Update Grade: ");
        int rollToUpdate = scanner.nextInt();
        System.out.println("Enter New Grade: ");
        char newGrade = scanner.next().charAt(0);
        studentList.updateStudentGrade(rollToUpdate, newGrade);
        
        System.out.println("Updated List:");
        studentList.displayAllStudents();
    }
}
