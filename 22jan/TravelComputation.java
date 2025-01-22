import java.util.Scanner; 
public class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToViaDistance = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCityDistance = input.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        double fromToViaTime = input.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in hours): ");
        double viaToFinalCityTime = input.nextDouble();

        double totalDistance = fromToViaDistance + viaToFinalCityDistance;
        double totalTime = fromToViaTime + viaToFinalCityTime;

        System.out.println(name + " travels from " + fromCity + " to " + toCity + " via " + viaCity + ".\n" +
            "The distance from " + fromCity + " to " + viaCity + " is " + fromToViaDistance + " miles,\n" +
            "and the distance from " + viaCity + " to " + toCity + " is " + viaToFinalCityDistance + " miles.\n" +
            "The total distance is " + totalDistance + " miles.\n" +
            "The total time taken is " + totalTime + " hours.");
    }
}
