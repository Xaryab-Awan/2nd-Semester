package Q8;

import java.util.ArrayList;

class Hospital {
    private ArrayList<Patient> patients;

    public Hospital() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getPatientId() + " added successfully.");
    }

    public void removePatient(String patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                patients.remove(patient);
                System.out.println("Patient " + patientId + " removed successfully.");
                return;
            }
        }
        System.out.println("Patient " + patientId + " not found.");
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients in the hospital.");
            return;
        }
        System.out.println("Hospital Patient List:");
        for (Patient patient : patients) {
            patient.displayPatientDetails();
        }
    }
}
