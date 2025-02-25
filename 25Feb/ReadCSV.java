public class ReadCSV {
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println(String.join(", ", nextLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
