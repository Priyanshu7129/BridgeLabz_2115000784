import java.util.Scanner;
public class Vehicle {
    private static double registrationFee = 10000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        String registrationNumber = sc.nextLine();

        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);
        vehicle.displayRegistrationDetails();

        System.out.print("Enter new registration fee: ");
        double newFee = sc.nextDouble();
        updateRegistrationFee(newFee);

        System.out.println("Updated Registration Details:");
        vehicle.displayRegistrationDetails();
    }
}