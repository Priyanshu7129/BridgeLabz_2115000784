public class CountRows {
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            int count = 0;
            while (reader.readNext() != null) {
                count++;
            }
            System.out.println("Total rows: " + (count - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
