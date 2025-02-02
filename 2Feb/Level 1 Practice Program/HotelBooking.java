import java.util.Scanner;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "pk";
        this.roomType = "Suite";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking another) {
        this.guestName = another.guestName;
        this.roomType = another.roomType;
        this.nights = another.nights;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guest name: ");
        String guestName = sc.nextLine();
        System.out.print("Enter room type: ");
        String roomType = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking booking = new HotelBooking(guestName, roomType, nights);
        System.out.println("Guest: " + booking.guestName + ", Room Type: " + booking.roomType + ", Nights: " + booking.nights);
    }
}