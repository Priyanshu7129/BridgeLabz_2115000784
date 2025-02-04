import java.util.Scanner;
public class Patient {
    private static String hospitalName = "AIIMS";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static int getTotalPatients() {
        return totalPatients;
    }
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        String patientID = sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Ailment: ");
        String ailment = sc.nextLine();

        Patient patient = new Patient(patientID, name, age, ailment);
        patient.displayPatientDetails();

        System.out.println("Total Patients Admitted: " + getTotalPatients());
    }
}