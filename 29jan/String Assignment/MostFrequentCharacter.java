import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequent = '\0';
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = countOccurrences(str, currentChar);
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentChar;
            }
        }
        return mostFrequent;
    }
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
