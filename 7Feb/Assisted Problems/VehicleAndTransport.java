class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car, Seat Capacity: " + seatCapacity);
    }
}
class Truck extends Vehicle {
    int cargoCapacity; 

    public Truck(int maxSpeed, String fuelType, int cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck, Cargo Capacity: " + cargoCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle, Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
public class VehicleAndTransport {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 15),
            new Motorcycle(160, "Petrol", false)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
