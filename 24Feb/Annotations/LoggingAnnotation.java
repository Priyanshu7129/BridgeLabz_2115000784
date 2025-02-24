import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}
class ExecutionTimeLogger {
    @LogExecutionTime
    public void fastMethod() {
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++);
        long endTime = System.nanoTime();
        System.out.println("Execution time of fastMethod: " + (endTime - startTime) + " nanoseconds");
    }
    
    @LogExecutionTime
    public void slowMethod() {
        long startTime = System.nanoTime();
       
        for (int i = 0; i < 1000000; i++);
        long endTime = System.nanoTime();
        System.out.println("Execution time of slowMethod: " + (endTime - startTime) + " nanoseconds");
    }
}
public class LoggingAnnotation {
    public static void main(String[] args) throws Exception {
        ExecutionTimeLogger logger = new ExecutionTimeLogger();
        logger.fastMethod();
        logger.slowMethod();
    }
}
