import java.util.Scanner;
class AthleteRoundsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of triangle: ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        int rounds = calculateRounds(perimeter);
        System.out.println("Rounds needed to complete 5 km: " + rounds);
    }
    public static int calculateRounds(double perimeter) {
        return (int) Math.ceil(5000 / perimeter);
    }
}