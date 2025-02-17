import java.io.*;

class LargeFileReadingEfficiency {

    
    public static void exectionTime(String path) {
        
        try {
            FileReader f1 = new FileReader(path);
            
            FileInputStream fi1 = new FileInputStream(path);
            InputStreamReader i1 = new InputStreamReader(fi1);

            long startTime = System.nanoTime();
            int r;
            while ((r = f1.read()) != -1) {
            }
            
            System.out.println("FileReader: " + (System.nanoTime() - startTime) / 1000000.0 + " ms");
            
            startTime = System.nanoTime();
            while ((r = i1.read()) != -1) {
            }
            
            System.out.println("InputStreamReader: " + (System.nanoTime() - startTime) / 1000000.0 + " ms");
            
            f1.close();
            i1.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
    
        System.out.println("For 1mb file:");
        exectionTime("largefile_1mb.txt");
        System.out.println();
    
        System.out.println("For 100mb file");
        exectionTime("largefile_100mb.txt");
        System.out.println();
    
        System.out.println("For 500mb file");
        exectionTime("largefile_500mb.txt");
        System.out.println();
    
    }
}
