package Q11;

public class ResidentialConsumer extends ElectricityConsumer{
    public ResidentialConsumer(String consumerId, int unitConsumed, boolean peakHour) {
        super(consumerId, unitConsumed, peakHour);
    }

    public void calculateBill(){
        this.amount=UnitConsumed+100;
    }
    public void applyPeakHourPenalty(){
        if(peakHour){
            if(peakHour){
                this.amount=UnitConsumed*2;
            }
            else {
                this.amount=UnitConsumed*1.2;


            }
        }
    }


}
