package practices.PP_2;

public class Employee {
    private String employee_name;
    private String employee_id;
    private int working_hours;
    private double salary;

    public Employee(String employee_name, String employee_id, int working_hours, double salary) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.working_hours = working_hours;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
