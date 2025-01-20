import java.util.Scanner;
public class Tempreature{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the temp in celsius: ");
		double tempC = sc.nextDouble();
		double tempF = ((tempC*9)/5) + 32;
		System.out.print("temp in farhenheit is: "+tempF);
	}
}