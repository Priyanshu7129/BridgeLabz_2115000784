import java.io.*;
import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        String filePath;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the file path: ");
            filePath = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading input.");
            return;
        }
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); // Splitting on non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nTop 5 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            if (++count == 5) break;
        }
    }
}
