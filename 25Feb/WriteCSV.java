public class WriteCSV {
    public static void main(String[] args) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("employees.csv"))) {
            String[] header = { "ID", "Name", "Department", "Salary" };
            String[] emp1 = { "101", "John Doe", "Engineering", "60000" };
            String[] emp2 = { "102", "Jane Smith", "HR", "50000" };
            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
