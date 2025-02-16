import java.io.*;
import java.util.Scanner;
public class CountOccurence {
    public static int countWordOccurrences(String fileName, String targetWord) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        System.out.print("Enter the word to count: ");
        String targetWord = sc.nextLine();
        int occurrences = countWordOccurrences(fileName, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + occurrences + " times.");
    }
}
