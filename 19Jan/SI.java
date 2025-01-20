import java.util.Scanner;
public class SI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the principal amount: ");
		double p = sc.nextDouble();
		System.out.print("enter the rate of interest: ");
		double r = sc.nextDouble();
		System.out.print("enter the time period in year: ");
		int t = sc.nextInt();
		double SimpleInterest = (p * r * t)/100;
		System.out.println("simple interest is: "+SimpleInterest);
	}
}