import java.util.Scanner;
public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        String modifiedSentence = replace(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
    public static String replace(String sentence, String oldWord, String newWord) {
        String result = "";
        int startIndex = 0;
        while (startIndex < sentence.length()) {
            int index = findSubstring(sentence, oldWord, startIndex);
            if (index == -1) {
                result += sentence.substring(startIndex); 
                break;
            }
            result += sentence.substring(startIndex, index); 
            result += newWord; 
            startIndex = index + oldWord.length(); 
        }
        return result;
    }
    public static int findSubstring(String str, String sub, int start) {
        for (int i = start; i <= str.length() - sub.length(); i++) {
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i; 
            }
        }
        return -1; 
    }
}
