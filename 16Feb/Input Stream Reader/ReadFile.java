import java.io.*;
import java.util.Scanner;
public class ReadFile {
    public static void writeUserInputToFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter text to write to the file (type 'exit' to stop):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to write: ");
        String fileName = sc.nextLine();
        writeUserInputToFile(fileName);
        System.out.println("Input saved to file.");
    }
}
