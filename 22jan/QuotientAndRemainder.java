import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("enter the second number: ");
		int num2 = sc.nextInt();

		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.print("The quotient is " + quotient + " and remainder is " + remainder + " of two numbers " + num1 + " and" + num2);
}
}

