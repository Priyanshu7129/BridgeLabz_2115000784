public class FilterCSV {
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (!nextLine[0].equals("ID") && Integer.parseInt(nextLine[3]) > 80) {
                    System.out.println(String.join(", ", nextLine));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
