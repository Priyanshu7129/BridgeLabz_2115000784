import java.util.Scanner;
public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Radius: " + circle.radius);
    }
}