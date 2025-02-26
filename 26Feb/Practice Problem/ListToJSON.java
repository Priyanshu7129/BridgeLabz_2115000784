import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ListToJSON {
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(new Person("ABC", 22), new Person("PQR", 30));
        String json = new ObjectMapper().writeValueAsString(people);
        System.out.println(json);
    }
}
