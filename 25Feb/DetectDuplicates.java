public class DetectDuplicates {
    public static void main(String[] args) {
        Set<String> seen = new HashSet<>();
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (!seen.add(nextLine[0])) {
                    System.out.println("Duplicate record: " + String.join(", ", nextLine));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
