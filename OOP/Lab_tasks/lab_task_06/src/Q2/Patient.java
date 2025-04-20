package Q2;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private MedicalRecord medicalRecord;

    public Patient(String name, int age, String gender, MedicalRecord medicalRecord) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.medicalRecord = medicalRecord;
    }
    public void Display_details(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Medical Record: ");
        medicalRecord.Display();

    }
}
