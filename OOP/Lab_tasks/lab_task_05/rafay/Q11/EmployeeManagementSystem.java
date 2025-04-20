package Q11;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void searchByDepartment(String department) {
        boolean found = false;
        System.out.println("Employees in Department '" + department + "':");
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in this department.");
        }
    }

    public double calculateAverageSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employees by Department");
            System.out.println("4. Calculate Average Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    Employee employee = new Employee(employeeId, name, department, salary);
                    system.addEmployee(employee);
                    break;

                case 2:
                    system.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Department to Search: ");
                    String searchDepartment = scanner.nextLine();
                    system.searchByDepartment(searchDepartment);
                    break;

                case 4:
                    double averageSalary = system.calculateAverageSalary();
                    System.out.println("Average Salary of All Employees: $" + averageSalary);
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}