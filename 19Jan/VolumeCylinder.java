import java.util.Scanner;
public class VolumeCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius of the cylinder: ");
		double r = sc.nextDouble();
		System.out.print("enter the height of the cylinder: ");
		double h = sc.nextDouble();
		double volume = Math.PI * Math.pow(r , 2) * h;
		System.out.println("the volume of cylinder is: "+volume);
	}
}