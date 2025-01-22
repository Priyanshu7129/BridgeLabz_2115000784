import java.util.Scanner; 
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble(); 
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble(); 
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble(); // 
        
        double result1 = a + b * c;         
        double result2 = a * b + c;         
        double result3 = c + a / b;         
        double result4 = a % b + c;         

        System.out.println(
            "The results of Double Operations are: " +
            "a + b * c = " + result1 + ", " +
            "a * b + c = " + result2 + ", " +
            "c + a / b = " + result3 + ", " +
            "a % b + c = " + result4
        );

        
    }
}
