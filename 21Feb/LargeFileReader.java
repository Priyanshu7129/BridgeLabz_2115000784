import java.io.*;
public class LargeFileReader {
    public static void main(String[] args) throws IOException {
        readLargeFile();
    }
    static void readLargeFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("large.txt"));
        String line;
        while ((line = br.readLine()) != null)
            if (line.toLowerCase().contains("error"))
                System.out.println(line);
        br.close();
    }
}
