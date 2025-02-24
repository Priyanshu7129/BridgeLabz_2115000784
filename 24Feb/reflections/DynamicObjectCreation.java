import java.lang.reflect.*;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public String getName() {
        return name;
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        Student student = constructor.newInstance();
        System.out.println("Created Student: " + student.getName());
    }
}
