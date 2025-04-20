package Q11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ElectricityConsumer e1=new ResidentialConsumer("3055",200,true);
        ElectricityConsumer e2=new CommercialConsumer("2551",100,false);
        ElectricityConsumer e3=new IndustrialConsumer("3007",300,true);
        e1.applyPeakHourPenalty();
        e1.calculateBill();
        e1.generateBill();
        e2.applyPeakHourPenalty();
        e2.calculateBill();
        e2.generateBill();
        e3.applyPeakHourPenalty();
        e3.calculateBill();
        e3.generateBill();
        ArrayList<ElectricityConsumer> e4=new ArrayList<>();
        e4.add(e1);
        e4.add(e2);
        e4.add(e3);
        BillAudit audit = new BillAudit();
        audit.AverageBill(e4);

    }
}
