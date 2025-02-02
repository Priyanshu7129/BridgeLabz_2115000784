import java.util.Scanner;
public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter owner name: ");
        String ownerName = sc.nextLine();
        System.out.print("Enter vehicle type: ");
        String vehicleType = sc.nextLine();

        Vehicle vehicle = new Vehicle(ownerName, vehicleType);
        vehicle.displayVehicleDetails();
        System.out.print("Enter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        System.out.println("Registration Fee: " + Vehicle.registrationFee);
    }
}