import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the base of number: ");
		int b = sc.nextInt();
		System.out.print("enter the exponent of number: ");
		int e = sc.nextInt();
		double result = Math.pow(b, e);
		System.out.print("The value of number is: "+result);
		
	}
}