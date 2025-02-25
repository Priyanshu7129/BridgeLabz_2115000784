public class SearchCSV {
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("employees.csv"))) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter employee name: ");
            String searchName = sc.nextLine();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + nextLine[2] + ", Salary: " + nextLine[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
