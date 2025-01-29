import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();
        
        int minLength = Math.min(string1.length(), string2.length());
        int comparisonResult = 0;

        for (int i = 0; i < minLength; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                comparisonResult = string1.charAt(i) - string2.charAt(i);
                break;
            }
        }
        if (comparisonResult == 0) {
            comparisonResult = string1.length() - string2.length();
        }
        if (comparisonResult < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + string2 + "\" comes before \"" + string1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}