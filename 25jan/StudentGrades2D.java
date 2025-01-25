import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            do {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextInt();
                if (marks[i][0] < 0) {
                    System.out.println("Please enter a positive value.");
                }
            } while (marks[i][0] < 0);
            do {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt();
                if (marks[i][1] < 0) {
                    System.out.println("Please enter a positive value.");
                }
            } while (marks[i][1] < 0);
            do {
                System.out.print("Maths: ");
                marks[i][2] = sc.nextInt();
                if (marks[i][2] < 0) {
                    System.out.println("Please enter a positive value.");
                }
            } while (marks[i][2] < 0);
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
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
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10s\n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}