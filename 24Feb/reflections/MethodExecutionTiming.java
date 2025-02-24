import java.lang.reflect.*;

class Operations {
    void performTask() {
        for (int i = 0; i < 1000000; i++);
    }
}
public class MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        Method method = Operations.class.getMethod("performTask");
        long start = System.nanoTime();
        method.invoke(new Operations());
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
