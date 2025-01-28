import java.util.Scanner;
public class EuclideanDistance {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];         
        double m = (y2 - y1) / (x2 - x1);
        result[0] = m;
        double b = y1 - m * x1;
        result[1] = b;         
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        System.out.printf("Line Equation: y = %.2fx + %.2f%n", slope, yIntercept);
    }
}