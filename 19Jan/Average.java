import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("enter the second number: ");
		double b = sc.nextDouble();
		System.out.print("enter the third number: ");
		double c = sc.nextDouble();
		double avg = ((a+b+c)/3);
		System.out.print("The average of three numbers is: "+avg);
		
	}
}