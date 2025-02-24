import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}
class ImportantTasks {
    @ImportantMethod(level = "HIGH")
    public void criticalTask() {
        System.out.println("Performing critical task");
    }
    
    @ImportantMethod(level = "MEDIUM")
    public void importantTask() {
        System.out.println("Performing important task");
    }
    
    public void regularTask() {
        System.out.println("Performing regular task");
    }
}
public class MarkAnnotation {
    public static void main(String[] args) throws Exception {
        ImportantTasks tasks = new ImportantTasks();
        Method[] methods = tasks.getClass().getMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}
