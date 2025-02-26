import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Record {
    public int id;
    public String name;
    public int age;

    public Record(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class DatabaseToJSON {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");

        List<Record> records = new ArrayList<>();
        while (rs.next()) {
            records.add(new Record(rs.getInt("id"), rs.getString("name"), rs.getInt("age")));
        }

        String json = new ObjectMapper().writeValueAsString(records);
        System.out.println(json);

        conn.close();
    }
}
