import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Employee {
    public String name;
    public int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ListToJSONArray {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = Arrays.asList(new Employee("ABC", 25), new Employee("PQR", 28));
        String json = new ObjectMapper().writeValueAsString(employees);
        System.out.println(json);
    }
}
