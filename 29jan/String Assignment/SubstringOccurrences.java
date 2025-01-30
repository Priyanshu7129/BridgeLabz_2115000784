import java.util.Scanner;
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = sc.nextLine();

        int occurrences = countSubstringOccurrences(mainString, subString);
        System.out.println("Occurrences of \"" + subString + "\": " + occurrences);
    }
    public static int countSubstringOccurrences(String str, String sub) {
        if (sub.length() > str.length() || sub.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (isSubstringMatch(str, sub, i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isSubstringMatch(String str, String sub, int start) {
        for (int i = 0; i < sub.length(); i++) {
            if (str.charAt(start + i) != sub.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
