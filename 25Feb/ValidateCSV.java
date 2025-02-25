public class ValidateCSV {
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (!Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", nextLine[4])) {
                    System.out.println("Invalid email: " + nextLine[4]);
                }
                if (!Pattern.matches("\\d{10}", nextLine[5])) {
                    System.out.println("Invalid phone number: " + nextLine[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
