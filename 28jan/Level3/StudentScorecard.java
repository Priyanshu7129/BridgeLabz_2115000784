import java.util.*;
public class StudentScorecard{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(100); // Physics
            scores[i][1] = random.nextInt(100); // Chemistry
            scores[i][2] = random.nextInt(100); // Math
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100; 
            results[i][0] = Math.round(total * 100.0) / 100.0; 
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("-----------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t\t%s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grade);
        }

        System.out.println("-----------------------------------------------------");
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
}