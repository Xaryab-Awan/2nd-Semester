package Q11;

import java.util.ArrayList;

public class BillAudit {
    double avgBill;
    public void AverageBill(ArrayList<ElectricityConsumer> electricityConsumers){
        for(ElectricityConsumer electricityConsumer : electricityConsumers){
             avgBill +=electricityConsumer.amount;
        }
        System.out.println("Average Bill: " + avgBill);
    }
}
