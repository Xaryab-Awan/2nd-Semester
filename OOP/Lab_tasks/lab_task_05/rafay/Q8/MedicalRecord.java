package Q8;

import java.util.ArrayList;

class MedicalRecord {
    private String illnessHistory;
    private String prescriptions;
    private String doctorNotes;
    private String testResults;

    public MedicalRecord(String illnessHistory, String prescriptions, String doctorNotes, String testResults) {
        this.illnessHistory = illnessHistory;
        this.prescriptions = prescriptions;
        this.doctorNotes = doctorNotes;
        this.testResults = testResults;
    }

    public void displayMedicalRecord() {
        System.out.println("Illness History: " + illnessHistory);
        System.out.println("Prescriptions: " + prescriptions);
        System.out.println("Doctor Notes: " + doctorNotes);
        System.out.println("Test Results: " + testResults);
    }
}




