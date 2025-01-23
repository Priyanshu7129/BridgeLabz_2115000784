import java.util.Scanner;
public class CountdownToOneFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value for the countdown: ");
        int counter = sc.nextInt();
		
        for(int i = counter;i>=1;i--){
			System.out.println(i);
		}
    }
}
