import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
class ProjectTasks {
    @Todo(task = "Implement login feature", assignedTo = "Alice")
    public void loginFeature() {
        System.out.println("Login feature development");
    }   
    @Todo(task = "Set up database schema", assignedTo = "Bob", priority = "HIGH")
    public void setupDatabase() {
        System.out.println("Database schema setup");
    }
}
public class TodoAnnotation {
    public static void main(String[] args) throws Exception {
        ProjectTasks projectTasks = new ProjectTasks();
        Method[] methods = projectTasks.getClass().getMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName() + ", Task: " + todo.task() 
                                   + ", Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}
