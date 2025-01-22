import java.util.Scanner;
public class NumberOfRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side3: ");
        double side3 = input.nextDouble();
       
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5 * 1000; 
        double rounds = distanceToRun / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);
    }
}
