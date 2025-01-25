import java.util.Scanner;
public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            do {
                System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                physicsMarks[i] = sc.nextInt();
            } while (physicsMarks[i] < 0);
            do {
                System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                chemistryMarks[i] = sc.nextInt();
            } while (chemistryMarks[i] < 0);
            do {
                System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                mathsMarks[i] = sc.nextInt();
            } while (mathsMarks[i] < 0);
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10s\n", (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], grades[i]);
        }
    }
}