import java.util.Scanner; 
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = input.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.%n", simpleInterest, principal, rate, time);
    }
}
