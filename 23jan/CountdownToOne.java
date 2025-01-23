import java.util.Scanner;
public class CountdownToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting value for the countdown: ");
        int counter = scanner.nextInt();
		
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
