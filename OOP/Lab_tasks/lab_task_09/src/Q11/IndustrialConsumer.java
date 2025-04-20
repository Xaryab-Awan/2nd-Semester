package Q11;

public class IndustrialConsumer extends ElectricityConsumer{

    public IndustrialConsumer(String consumerId, int unitConsumed, boolean peakHour) {
        super(consumerId, unitConsumed, peakHour);
    }

    public void calculateBill(){
        this.amount=UnitConsumed+300;
    }
    public void applyPeakHourPenalty(){
        if(peakHour){
            if(peakHour){
                this.amount=UnitConsumed*3;
            }
            else {
                this.amount=UnitConsumed*1.2;


            }
        }
    }
}
