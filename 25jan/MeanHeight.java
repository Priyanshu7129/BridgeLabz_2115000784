import java.util.Scanner;
class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0; 
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }        
        double meanHeight = sum / heights.length;
        System.out.println("Mean height of the football team: " + meanHeight);
    }
}