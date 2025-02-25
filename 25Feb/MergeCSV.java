public class MergeCSV {
    public static void main(String[] args) {
        HashMap<String, String[]> studentData = new HashMap<>();
        try (CSVReader reader1 = new CSVReader(new FileReader("students1.csv"));
                CSVReader reader2 = new CSVReader(new FileReader("students2.csv"))) {
            reader1.readNext();
            String[] nextLine;
            while ((nextLine = reader1.readNext()) != null) {
                studentData.put(nextLine[0], nextLine);
            }
            reader2.readNext();
            while ((nextLine = reader2.readNext()) != null) {
                studentData.put(nextLine[0], new String[] { nextLine[0], studentData.get(nextLine[0])[1],
                        studentData.get(nextLine[0])[2], nextLine[1], nextLine[2] });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter("merged_students.csv"))) {
            writer.writeNext(new String[] { "ID", "Name", "Age", "Marks", "Grade" });
            for (String[] data : studentData.values()) {
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
