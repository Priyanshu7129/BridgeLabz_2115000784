import java.util.Scanner;
public class Distance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the distance in kilometer: ");
		double distKM = sc.nextDouble();
		double distMiles = distKM * 0.621371;
		System.out.print("distance in miles is: "+distMiles);
	}
}