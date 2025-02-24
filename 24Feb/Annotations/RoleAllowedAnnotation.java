import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}
class AccessControl {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed.");
    }
    public void generalTask() {
        System.out.println("General task executed.");
    }
}
public class RoleAllowedAnnotation {
    public static void main(String[] args) throws Exception {
        AccessControl accessControl = new AccessControl();
        String currentUserRole = "USER";        
        Method[] methods = accessControl.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.value().equals(currentUserRole)) {
                    method.invoke(accessControl);
                } else {
                    System.out.println("Access Denied for method: " + method.getName());
                }
            } else {
                method.invoke(accessControl);
            }
        }
    }
}
