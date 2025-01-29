import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
