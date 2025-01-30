import java.util.Scanner;
public class LongestWordSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);
    }
    public static String findLongestWord(String sentence) {
        String longestWord = "", currentWord = "";
        int maxLength = 0;

        for (int i = 0; i <= sentence.length(); i++) {
            char ch = (i < sentence.length()) ? sentence.charAt(i) : ' '; 
            if (ch != ' ') {
                currentWord += ch; 
            } else {
                if (currentWord.length() > maxLength) {
                    longestWord = currentWord;
                    maxLength = currentWord.length();
                }
                currentWord = ""; 
            }
        }
        return longestWord;
    }
}
