class Student {
    String id, name;
    int age;

    Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " - " + name + " - " + age;
    }
}

public class CSVToObjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                students.add(new Student(nextLine[0], nextLine[1], Integer.parseInt(nextLine[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        students.forEach(System.out::println);
    }
}
