package practices.PP_2;

import java.util.ArrayList;

public class BusinessType {
    protected ArrayList<Office> offices;

    public BusinessType(ArrayList<Office> offices) {
        this.offices = offices;
    }
    public void FileReport(){};

    public void ViewAmount(){
        double amount=0;
        for(Office office : offices) {
            for(Employee employee : office.employees) {
                amount += employee.getSalary();
            }
        }
        System.out.println("Total Amount: " + amount);
    }
}
