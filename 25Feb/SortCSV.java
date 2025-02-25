public class SortCSV {
    public static void main(String[] args) {
        List<String[]> records = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("employees.csv"))) {
            String[] header = reader.readNext();
            records.add(header);
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                records.add(nextLine);
            }
            records.sort((a, b) -> Integer.compare(Integer.parseInt(b[3]), Integer.parseInt(a[3])));
            System.out.println("Top 5 highest-paid employees:");
            for (int i = 1; i <= 5 && i < records.size(); i++) {
                System.out.println(String.join(", ", records.get(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
