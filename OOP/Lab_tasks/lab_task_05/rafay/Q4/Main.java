package Q4;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Minhal", "Computer Science");
        Instructor instructor2 = new Instructor("Alishba", "Mathematics");
        Instructor instructor3 = new Instructor("Rabia", "Physics");

        Course course1 = new Course("Introduction to Programming", "CS101");
        Course course2 = new Course("Calculus I", "MATH101");
        Course course3 = new Course("Physics for Engineers", "PHY101");
        Course course4 = new Course("Data Structures", "CS201");

        course1.assignInstructor(instructor1);
        course2.assignInstructor(instructor2);
        course3.assignInstructor(instructor3);
        course4.assignInstructor(instructor1);

        Student student1 = new Student("S001", "Abdulrafay", "Computer Science");
        Student student2 = new Student("S002", "Xaryab", "Mathematics");
        Student student3 = new Student("S003", "Bisma", "Computer Science");
        Student student4 = new Student("S004", "Sara", "Physics");
        Student student5 = new Student("S005", "Saraib", "Computer Science");

        course1.addStudent(student1);
        course1.addStudent(student3);
        course1.addStudent(student5);

        course2.addStudent(student2);

        course3.addStudent(student4);

        course4.addStudent(student1);
        course4.addStudent(student5);

        System.out.println("========== COURSE REPORT ==========");
        course1.display();
        course2.display();
        course3.display();
        course4.display();
    }
}