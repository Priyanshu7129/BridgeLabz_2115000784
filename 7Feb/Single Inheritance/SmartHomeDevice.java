class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}
class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Thermostat Temperature: " + temperatureSetting + "°C");
    }
}
public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "Active", 22);
        thermostat.displayStatus();
    }
}
