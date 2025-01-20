import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius of the circle: ");
		double radius = sc.nextDouble();
		double area = Math.PI * Math.pow(radius , 2);
		System.out.println("the area of circle is: "+area);
	}
}