import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggledString = toggleCase(input);
        System.out.println("Toggled Case String: " + toggledString);
    }
    public static String toggleCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + ('a' - 'A')); 
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - ('a' - 'A'));
            } else {
                result += ch; 
            }
        }
        return result;
    }
}
