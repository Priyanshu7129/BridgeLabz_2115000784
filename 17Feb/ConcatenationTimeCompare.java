public class ConcatenationTimeCompare {

    public static double usingString(int freq) {
        String dummy = "hello";

        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < freq; i++)
            str += dummy;

        long endTime = System.nanoTime();
        
        return (double) (endTime - startTime) / 1000000;
    }

    public static double usingStringBuilder(int freq) {
        String dummy = "hello";

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq; i++) {
            sb.append(dummy);
        }

        long endTime = System.nanoTime();

        return (double) (endTime - startTime) / 1000000;
    }

    public static double usingStringBuffer(int freq) {
        String dummy = "hello";

        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < freq; i++) {
            sbf.append(dummy);
        }

        long endTime = System.nanoTime();

        return (double) (endTime - startTime) / 1000000;
    }

    public static void main(String[] args) {
        System.out.println("Comparing the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating strings.");
        
        System.out.println("For N=1000:");
        System.out.println("String: " + usingString(1000) + " ms");
        System.out.println("StringBuilder: " + usingStringBuilder(1000) + " ms");
        System.out.println("StringBuffer: " + usingStringBuffer(1000) + " ms\n");

        System.out.println("For N=10000:");
        System.out.println("String: " + usingString(10000) + " ms");
        System.out.println("StringBuilder: " + usingStringBuilder(10000) + " ms");
        System.out.println("StringBuffer: " + usingStringBuffer(10000) + " ms\n");

        System.out.println("For N=1000000:");
        System.out.println("String: " + usingString(1000000) + " ms");
        System.out.println("StringBuilder: " + usingStringBuilder(1000000) + " ms");
        System.out.println("StringBuffer: " + usingStringBuffer(1000000) + " ms\n");

    }
}
    
    
