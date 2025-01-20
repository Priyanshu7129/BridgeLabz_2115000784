import java.util.Scanner;
public class Perimeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of rectangle: ");
		int l = sc.nextInt();
		System.out.print("enter the width of rectangle: ");
		int w = sc.nextInt();
		int perimeter = 2 * (l + w);
		System.out.print("The perimeter of rectangle is: "+perimeter);
		}
}