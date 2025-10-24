package tugas1;

public class hospital {
    public String hospitalName;
    public String address;
    public patient patient;

    public hospital(String hospitalName, String address, patient patient) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patient = patient;
    }

    public void printHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Address: " + address);
        patient.printPatientDetails();
    }
}
