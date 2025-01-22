import java.util.Scanner;
public class Calculator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();

                float add = num1 + num2;
                float sub = num1 - num2;
                float mul = num1 * num2;
                float divide = num1 / num2;

                System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and" + num2 + " is " + add + "," + sub + "," + mul + ", and " + divide);
}
}

