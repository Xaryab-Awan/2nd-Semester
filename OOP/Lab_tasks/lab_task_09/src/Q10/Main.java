package Q10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RestrauntPartner r1=new RestrauntPartner(true,500);
        DeliveryPolicy  r2=new RestrauntPartner(false,700);
        DeliveryPolicy r3=new RestrauntPartner(true,600);
        ArrayList<DeliveryPolicy> d1=new ArrayList<>();
        d1.add(r2);
        d1.add(r3);
        r1.assignRider();
        r2.assignRider();
        r3.assignRider();
        r1.calculateDeliveryCharge();
        r2.calculateDeliveryCharge();
        r3.calculateDeliveryCharge();
        r1.calculatePreparationTime(true);
        for(DeliveryPolicy d:d1){
            d.assignRider();
        }

    }
}
