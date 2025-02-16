import java.io.*;
import java.util.StringTokenizer;

public class CompareBufferBuilderFileReaderInputStreamReader {
    // StringBuilder vs StringBuffer
    public static void StringBuilderVsStringBuffer() {
        String text = "DummyText";

        // for StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + ((endTime - startTime)/100000) + " ms");

        // StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + ((endTime - startTime)/100000) + " ms");
    }

    // Method to read file using FileReader
    public static void readFileWithFileReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += new StringTokenizer(line).countTokens();
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("FileReader - Word Count: " + wordCount + ", Time: " + ((endTime - startTime)/100000) + " ms");
    }

    // Method to read file using InputStreamReader
    public static void readFileWithInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += new StringTokenizer(line).countTokens();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("InputStreamReader - Word Count: " + wordCount + ", Time: " + ((endTime - startTime)/100000) + " ms");
    }

    public static void main(String[] args) {
        // StringBuilder vs StringBuffer
        StringBuilderVsStringBuffer();

        
        String filePath = "large_file.txt"; //1oomb

        // Test FileReader vs InputStreamReader
        readFileWithFileReader(filePath);
        readFileWithInputStreamReader(filePath);
    }
}
