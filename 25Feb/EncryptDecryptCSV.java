public class EncryptDecryptCSV {
    private static final String SECRET_KEY = "1234567890123456";

    public static void main(String[] args) {
        encryptAndWriteCSV("sensitive_data.csv");
        decryptAndReadCSV("sensitive_data.csv");
    }

    private static void encryptAndWriteCSV(String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeNext(new String[] { "ID", "Name", "Email", "Salary" });
            writer.writeNext(new String[] { "301", "John Doe", encrypt("john@example.com"), encrypt("90000") });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void decryptAndReadCSV(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine[0] + " - " + nextLine[1] + " - " + decrypt(nextLine[2]) + " - "
                        + decrypt(nextLine[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    private static String decrypt(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}
