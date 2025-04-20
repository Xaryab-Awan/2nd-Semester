package Q8;

public class Main {
        public static void main(String[] args) {
            Hospital hospital = new Hospital();

            Patient patient1 = new Patient("P001", "John Doe", "Diabetes", "Insulin", "Monitor blood sugar regularly", "HbA1c: 6.5%");
            Patient patient2 = new Patient("P002", "Jane Smith", "Hypertension", "Lisinopril", "Monitor blood pressure daily", "BP: 130/80 mmHg");

            hospital.addPatient(patient1);
            hospital.addPatient(patient2);

            hospital.displayAllPatients();

            hospital.removePatient("P001");

            hospital.displayAllPatients();
        }
}