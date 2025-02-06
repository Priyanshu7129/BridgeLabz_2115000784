import java.util.*;
class Hospital {
    String n;
    List<Doctor> docs = new ArrayList<>();
    List<Patient> pts = new ArrayList<>();

    Hospital(String n) {
        this.n = n;
    }
    void addDoctor(Doctor d) {
        docs.add(d);
    }
    void addPatient(Patient p) {
        pts.add(p);
    }
    void showDoctors() {
        for (Doctor d : docs) {
            System.out.println("Doctor: " + d.n);
        }
    }
    void showPatients() {
        for (Patient p : pts) {
            System.out.println("Patient: " + p.n);
        }
    }
}
class Doctor {
    String n;
    Doctor(String n) {
        this.n = n;
    }
    void consult(Patient p) {
        System.out.println(n + " is consulting " + p.n);
    }
}
class Patient {
    String n;

    Patient(String n) {
        this.n = n;
    }
}
class HospitalDoctorPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hospitalName = sc.nextLine();
        Hospital hospital = new Hospital(hospitalName);

        System.out.print("Enter number of doctors in " + hospitalName + ": ");
        int doctorCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < doctorCount; i++) {

            String doctorName = sc.nextLine();
            Doctor doctor = new Doctor(doctorName);
            hospital.addDoctor(doctor);
        }
        System.out.print("Enter number of patients in " + hospitalName + ": ");
        int patientCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < patientCount; i++) {

            String patientName = sc.nextLine();
            Patient patient = new Patient(patientName);
            hospital.addPatient(patient);
        }
        hospital.showDoctors();

        hospital.showPatients();

        for (Doctor doctor : hospital.docs) {
            for (Patient patient : hospital.pts) {
                doctor.consult(patient);
            }
        }
        sc.close();
    }
}