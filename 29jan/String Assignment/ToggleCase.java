import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to toggle case: ");
        String inputString = sc.nextLine();
        StringBuilder toggledString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else {
                toggledString.append(Character.toUpperCase(c));
            }
        }
        System.out.println("Toggled case string: " + toggledString.toString());
    }
}