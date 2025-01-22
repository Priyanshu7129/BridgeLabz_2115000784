import java.util.Scanner; 
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt(); 
        System.out.print("Enter the value of b: ");
        int b = input.nextInt(); 
        System.out.print("Enter the value of c: ");
        int c = input.nextInt(); 

        int result1 = a + b * c;         // Multiplication has higher precedence than addition
        int result2 = a * b + c;         // Multiplication has higher precedence than addition
        int result3 = c + a / b;         // Division has higher precedence than addition
        int result4 = a % b + c;         // Modulus has higher precedence than addition

        System.out.println(
            "The results of Int Operations are: " +
            "a + b * c = " + result1 + ", " +
            "a * b + c = " + result2 + ", " +
            "c + a / b = " + result3 + ", " +
            "a % b + c = " + result4
        );
    }
}
