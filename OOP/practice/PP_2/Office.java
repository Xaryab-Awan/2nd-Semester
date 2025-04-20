package practices.PP_2;

import java.util.ArrayList;

public class Office {
    protected String office_code;
    protected String office_address;
    protected String telephoneNumber;
    protected double office_revenue;
    protected ArrayList<Employee> employees= new ArrayList<>();;

    public Office(String office_code, String office_address, String telephoneNumber, double office_revenue) {
        this.office_code = office_code;
        this.office_address = office_address;
        this.telephoneNumber = telephoneNumber;
        this.office_revenue = office_revenue;
    }
    public void addEmployee(String employee_name, String employee_id, int working_hours, double salary) {
        this.employees.add(new Employee(employee_name, employee_id,  working_hours,  salary));
    }
    public void DisplayDetails() {
        System.out.println("Office Code: " + office_code);
        System.out.println("Office Address: " + office_address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Office Revenue: " + office_revenue);
    }

    public double getOffice_revenue() {
        return office_revenue;
    }
    public double getEmployeeSalary() {
        double salary = 0;
        for(Employee employee: employees) {
            salary += employee.getSalary();
        }
        return salary;
    }
    @Override
    protected void finalize(){
        System.out.println("khtm");
    }
}
