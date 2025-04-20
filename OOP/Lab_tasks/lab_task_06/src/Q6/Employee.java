package Q6;

public class Employee {
    private String Employee_name;
    private int Employee_id;
    private int salary;

    public Employee(String employee_name, int employee_id, int salary) {
        Employee_name = employee_name;
        Employee_id = employee_id;
        this.salary = salary;
    }
    public void Employee_details() {
        System.out.println("Employee Name: " + Employee_name);
        System.out.println("Employee ID: " + Employee_id);
        System.out.println("Employee Salary: " + salary);
    }



}
