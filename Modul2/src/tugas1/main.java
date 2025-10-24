package tugas1;

public class main {
    public static void main(String[] args) {
        doctor doctor = new doctor("Dr. Sarah Lee", 2001, 12000, "Cardiology");
        patient patient = new patient("Michael Brown", 555, doctor, "Heart Disease");

        hospital hospital = new hospital("City General Hospital", "123 Main Street", patient);
        hospital.printHospitalDetails();

        System.out.println();
        doctor.applyBonus();
        doctor.printDetails();
    }
}

