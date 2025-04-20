package practices.PP_2;

import java.util.ArrayList;

public class Brokerage extends BusinessType {


    public Brokerage(ArrayList<Office> offices) {
        super(offices);
    }
    @Override
    public void FileReport(){
        double revuene=0;
        for(Office office:offices){
            revuene+=office.getOffice_revenue();
        }
        System.out.println("Revenue: "+revuene/2);
    }
}
