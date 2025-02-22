import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class FileProcessor {
    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }
    public String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }
}
public class FileProcessorTest {
    FileProcessor fileProcessor = new FileProcessor();

    @Test
    void testWriteAndReadFile() throws IOException {
        String filename = "testfile.txt";
        String content = "Hello, JUnit!";
        
        fileProcessor.writeToFile(filename, content);
        String result = fileProcessor.readFromFile(filename);

        assertEquals(content, result);
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}
