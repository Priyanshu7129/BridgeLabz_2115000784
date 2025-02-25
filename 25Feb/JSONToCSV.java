public class JSONToCSV{
    public static void main(String[] args) {
        convertJSONToCSV("students.json", "students.csv");
        convertCSVToJSON("students.csv", "students_out.json");
    }

    private static void convertJSONToCSV(String jsonFile, String csvFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile));
                CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
            JSONArray jsonArray = new JSONArray(br.readLine());
            writer.writeNext(new String[] { "ID", "Name", "Age" });
            for (Object obj : jsonArray) {
                JSONObject json = (JSONObject) obj;
                writer.writeNext(new String[] { json.getString("ID"), json.getString("Name"),
                        String.valueOf(json.getInt("Age")) });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void convertCSVToJSON(String csvFile, String jsonFile) {
        JSONArray jsonArray = new JSONArray();
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                JSONObject json = new JSONObject();
                json.put("ID", nextLine[0]);
                json.put("Name", nextLine[1]);
                json.put("Age", Integer.parseInt(nextLine[2]));
                jsonArray.put(json);
            }
            try (FileWriter file = new FileWriter(jsonFile)) {
                file.write(jsonArray.toString(4));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
