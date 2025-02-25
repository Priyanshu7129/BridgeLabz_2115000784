public class UpdateCSV {
    public static void main(String[] args) {
        List<String[]> lines = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("employees.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[2].equals("IT")) {
                    nextLine[3] = String.valueOf((int) (Integer.parseInt(nextLine[3]) * 1.1));
                }
                lines.add(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter("updated_employees.csv"))) {
            writer.writeAll(lines);
            System.out.println("Updated salaries saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
