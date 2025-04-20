package Q11;

public class CommercialConsumer extends ElectricityConsumer{
    public CommercialConsumer(String consumerId, int unitConsumed, boolean peakHour) {
        super(consumerId, unitConsumed, peakHour);
    }

    public void calculateBill(){
        this.amount=UnitConsumed+200;
    }
    public void applyPeakHourPenalty(){
        if(peakHour){
            if(peakHour){
                this.amount=UnitConsumed*2.2;
            }
            else {
                this.amount=UnitConsumed*1.2;


            }
        }
    }
}
