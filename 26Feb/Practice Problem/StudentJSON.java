import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "ABC");
        student.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("History");

        student.put("subjects", subjects);
        System.out.println(student.toString());
    }
}
