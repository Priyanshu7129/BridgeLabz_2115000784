import java.util.*;
public class CollinearPoints{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of point A: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y-coordinate of point A: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the x-coordinate of point B: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y-coordinate of point B: ");
        int y2 = sc.nextInt();
        System.out.print("Enter the x-coordinate of point C: ");
        int x3 = sc.nextInt();
        System.out.print("Enter the y-coordinate of point C: ");
        int y3 = sc.nextInt();
        boolean isCollinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by slope method: " + isCollinearBySlope);
        System.out.println("Collinear by area method: " + isCollinearByArea);
    }
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) (y2 - y1) / (x2 - x1);
    }
    
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
       
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; 
    }
}