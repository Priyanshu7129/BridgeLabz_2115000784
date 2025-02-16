import java.io.*;
import java.util.Scanner;
public class InputStreamReaderCode {
    public static void readBinaryFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to read: ");
        String fileName = sc.nextLine();
        readBinaryFile(fileName);
    }
}
