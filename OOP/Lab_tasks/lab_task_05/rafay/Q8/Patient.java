package Q8;

class Patient {
    private String patientId;
    private String name;
    private MedicalRecord medicalRecord;

    public Patient(String patientId, String name, String illnessHistory, String prescriptions, String doctorNotes, String testResults) {
        this.patientId = patientId;
        this.name = name;
        this.medicalRecord = new MedicalRecord(illnessHistory, prescriptions, doctorNotes, testResults);
    }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Medical Record:");
        medicalRecord.displayMedicalRecord();
        System.out.println();
    }

    public String getPatientId() {
        return patientId;
    }
}