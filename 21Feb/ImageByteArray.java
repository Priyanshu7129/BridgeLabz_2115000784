import java.io.*;
public class ImageByteArray {
    public static void main(String[] args) throws IOException {
        processImage();
    }
    static void processImage() throws IOException {
        FileInputStream fis = new FileInputStream("input.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1)
            baos.write(buffer, 0, bytesRead);
        fis.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        FileOutputStream fos = new FileOutputStream("output.jpg");
        while ((bytesRead = bais.read(buffer)) != -1)
            fos.write(buffer, 0, bytesRead);
        fos.close();
    }
}
