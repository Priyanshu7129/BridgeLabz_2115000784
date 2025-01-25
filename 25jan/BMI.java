import java.util.Scanner;
class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];     
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height of person(in meter) " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + weights[i] + ", Height = " + heights[i] + ", BMI = " + bmi[i] + ", Status = " + weightStatus[i]);
        }
    }
}