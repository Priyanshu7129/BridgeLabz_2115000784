import java.util.Scanner;
class TicketNode {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail;
    private int ticketCount;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.ticketCount = 0;
    }
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        ticketCount++;
    }
    public void removeTicket(int ticketID) {
        if (head == null) {
            return;
        }
        TicketNode current = head;
        TicketNode prev = null;

        do {
            if (current.ticketID == ticketID) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                ticketCount--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }
    public void searchTicketByCustomer(String customerName) {
        if (head == null) {
            return;
        }

        TicketNode current = head;
        do {
            if (current.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Movie: " + current.movieName +
                        ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            }
            current = current.next;
        } while (current != head);
    }
    public void searchTicketByMovie(String movieName) {
        if (head == null) {
            return;
        }
        TicketNode current = head;
        do {
            if (current.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            }
            current = current.next;
        } while (current != head);
    }
    public int getTotalBookedTickets() {
        return ticketCount;
    }
}
public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Ticket\n2. Remove Ticket\n3. Display Tickets\n4. Search by Customer\n5. Search by Movie\n6. Total Booked Tickets\n7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Ticket ID: ");
                int ticketID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Customer Name: ");
                String customerName = scanner.nextLine();
                System.out.print("Enter Movie Name: ");
                String movieName = scanner.nextLine();
                System.out.print("Enter Seat Number: ");
                String seatNumber = scanner.nextLine();
                System.out.print("Enter Booking Time: ");
                String bookingTime = scanner.nextLine();
                system.addTicket(ticketID, customerName, movieName, seatNumber, bookingTime);
            } else if (choice == 2) {
                System.out.print("Enter Ticket ID to remove: ");
                int ticketID = scanner.nextInt();
                system.removeTicket(ticketID);
            } else if (choice == 3) {
                system.displayTickets();
            } else if (choice == 4) {
                System.out.print("Enter Customer Name: ");
                String customerName = scanner.nextLine();
                system.searchTicketByCustomer(customerName);
            } else if (choice == 5) {
                System.out.print("Enter Movie Name: ");
                String movieName = scanner.nextLine();
                system.searchTicketByMovie(movieName);
            } else if (choice == 6) {
                System.out.println("Total Booked Tickets: " + system.getTotalBookedTickets());
            } else if (choice == 7) {
                break;
            }
        }
    }
}
