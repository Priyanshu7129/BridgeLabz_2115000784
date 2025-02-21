import java.util.*;
import java.io.*;

public class EfficientFileCopy {
    public static void copyFile(String src, String des, int buffersize) {
        long startTimeBuffered = System.nanoTime();
        long endTimeBuffered = System.nanoTime();
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src), buffersize);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des), buffersize);

            byte arr[] = new byte[buffersize];
            int bytesRead;
            while ((bytesRead = bis.read(arr)) != -1) {
                bos.write(arr, 0, bytesRead);
            }
            endTimeBuffered = System.nanoTime();

            System.out.println("Buffered Input Stream: " + (endTimeBuffered - startTimeBuffered) + " nanoseconds");

            bis.close();
            bos.close();

        } catch (Exception e) {
            System.out.println("Buffered Input Stream: " + e.getMessage());
        }
        long startTimeUnBuffered = System.nanoTime();
        long endTimeUnBuffered = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(des);

            byte arr[] = new byte[buffersize];
            int bytesRead;
            while ((bytesRead = fis.read(arr)) != -1) {
                fos.write(arr, 0, bytesRead);
            }
            endTimeUnBuffered = System.nanoTime();

            System.out.println("File Input Stream: " + (endTimeUnBuffered - startTimeUnBuffered) + " nanoseconds");

            fis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of source file to copy data: ");
        String src = sc.next();

        System.out.print("Enter destination file name if exists otherwise enter new file name: ");
        String des = sc.next();

        System.out.println("Enter buffer size: ");
        int buffersize = sc.nextInt();

        copyFile(src, des, buffersize);
    }
    
}
