import java.util.Scanner;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost(double dailyRate) {
        return rentalDays * dailyRate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter car model: ");
        String carModel = sc.nextLine();
        System.out.print("Enter rental days: ");
        int rentalDays = sc.nextInt();
        System.out.print("Enter daily rate: ");
        double dailyRate = sc.nextDouble();

        CarRental rental = new CarRental(customerName, carModel, rentalDays);
        double totalCost = rental.calculateTotalCost(dailyRate);
        System.out.println("Customer: " + rental.customerName + ", Car Model: " + rental.carModel + ", Total Cost: " + totalCost);
    }
}