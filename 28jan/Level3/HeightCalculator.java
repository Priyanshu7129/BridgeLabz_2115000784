import java.util.*;
public class HeightCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heights[] = new double[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = Math.random() * 100 + 150;
        }
        System.out.println("Sum: " + sum(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + mean(heights));
    }
    public static double sum(double h[]) {
        double sum = 0;
        for (int i = 0; i < h.length; i++) {
            sum += h[i];
        }
        return sum;
    }
    public static double shortest(double h[]) {
        double shortest = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] < shortest) {
                shortest = h[i];
            }
        }    
        return shortest;
    }
    public static double tallest(double h[]) {
        double largest = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] > largest) {
                largest = h[i];
            }
        }
        return largest;
    }
    public static double mean(double h[]) {
        double mean = sum(h);
        return mean / h.length;
    }
}