public class DatabaseToCSV {
    public static void main(String[] args) {
        List<String[]> employees = fetchEmployeesFromDB();
        try (CSVWriter writer = new CSVWriter(new FileWriter("employees_report.csv"))) {
            writer.writeNext(new String[] { "Employee ID", "Name", "Department", "Salary" });
            writer.writeAll(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String[]> fetchEmployeesFromDB() {
        return Arrays.asList(
                new String[] { "201", "Alice Brown", "Finance", "75000" },
                new String[] { "202", "Bob White", "IT", "82000" });
    }
}
