public class RecursiveIterativeFibonacci {
    
    public static int recFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static int itrFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = -1;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println("Comparing Recursive (O(2ⁿ)) vs Iterative (O(N)) Fibonacci solutions.\n");
        long startTime = 0;
        long endTime = 0;

        System.out.println("For n = 10:");
        startTime = System.nanoTime();
        recFibo(10);
        endTime = System.nanoTime();
        System.out.println("Recursive Method: " + (double) (endTime - startTime) / 1000000 + " ms");
        
        startTime = System.nanoTime();
        itrFibo(10);
        endTime = System.nanoTime();
        System.out.println("Iterative Method: " + (double) (endTime - startTime) / 1000000 + " ms\n");


        System.out.println("For n = 30:");

        startTime = System.nanoTime();
        recFibo(30);
        endTime = System.nanoTime();
        System.out.println("Recursive Method: " + (double) (endTime - startTime) / 1000000 + " ms");
        
        startTime = System.nanoTime();
        itrFibo(30);
        endTime = System.nanoTime();
        System.out.println("Iterative Method: " + (double) (endTime - startTime) / 1000000 + " ms\n");


        System.out.println("For n = 50:");

        startTime = System.nanoTime();
        recFibo(50);
        endTime = System.nanoTime();
        System.out.println("Recursive Method: " + (double) (endTime - startTime) / 1000000 + " ms");
        
        startTime = System.nanoTime();
        itrFibo(50);
        endTime = System.nanoTime();
        System.out.println("Iterative Method: " + (double) (endTime - startTime) / 1000000 + " ms\n");


    }
}
