package practices.PP_2;

import java.util.ArrayList;

public class Leasing extends BusinessType{
    public Leasing(ArrayList<Office> offices) {
        super(offices);
    }
    @Override
    public void FileReport(){
        double revenue=0;
        double salaries=0;
        for(Office office: offices) {
            revenue += office.getOffice_revenue();
            salaries+=office.getEmployeeSalary();
        }
        System.out.println("Revenue: "+(revenue-salaries));
    }
}
