import java.util.Scanner;
public class StringReverse {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
    }
}

