abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per km: " + ratePerKm;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
}
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }   
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }   
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }
}
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }   
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
public class RideApplication {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "PK", 10);
        Vehicle v2 = new Bike("B202", "DK", 5);
        Vehicle v3 = new Auto("A303", "VK", 7);
        
        System.out.println(v1.getVehicleDetails() + ", Fare: " + v1.calculateFare(10));
        System.out.println(v2.getVehicleDetails() + ", Fare: " + v2.calculateFare(10));
        System.out.println(v3.getVehicleDetails() + ", Fare: " + v3.calculateFare(10));
    }
}
