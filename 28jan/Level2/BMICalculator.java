import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3]; 
        for (int i = 0; i < members.length; i++) {
            System.out.print("Enter weight (in kg) for member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble(); 
            System.out.print("Enter height (in cm) for member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble(); 
        }
        calculateBMI(members);
        String[] bmiStatus = determineBMIStatus(members);
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < members.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10s\n", members[i][0], members[i][1], members[i][2], bmiStatus[i]);
        }
    }
    public static void calculateBMI(double[][] members) {
        for (int i = 0; i < members.length; i++) {
            double heightInMeters = members[i][1] / 100; 
            members[i][2] = members[i][0] / (heightInMeters * heightInMeters); 
        }
    }
    public static String[] determineBMIStatus(double[][] members) {
        String[] status = new String[members.length];
        for (int i = 0; i < members.length; i++) {
            double bmi = members[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}