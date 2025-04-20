package practices.PP_2;

import java.util.ArrayList;

public class Marketing extends BusinessType{
    public Marketing(ArrayList<Office> offices) {
        super(offices);
    }
    @Override
    public void FileReport() {
        double revenue=0;
        for(int i=0; i<offices.size(); i++){
            revenue+=offices.get(i).getOffice_revenue();
            if(i==2){
                break;
            }
        }
        System.out.println("Revenue: "+revenue/5);
    }
}
