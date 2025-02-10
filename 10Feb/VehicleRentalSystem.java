abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 500;
    }
    public String getInsuranceDetails() {
        return "Car Insurance: $500";
    }
}
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }
    public double calculateInsurance() {
        return 200;
    }
    public String getInsuranceDetails() {
        return "Bike Insurance: $200";
    }
}
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }
    public double calculateInsurance() {
        return 1000;
    }
    public String getInsuranceDetails() {
        return "Truck Insurance: $1000";
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 50),
            new Bike("BIKE456", 20),
            new Truck("TRUCK789", 80)
        };

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental Cost (5 days): $" + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println(i.getInsuranceDetails());
            }
        }
    }
}
