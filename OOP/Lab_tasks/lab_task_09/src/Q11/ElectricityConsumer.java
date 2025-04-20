package Q11;

public abstract class ElectricityConsumer {
    public String consumerId;
    public int UnitConsumed;
    public boolean peakHour;
    public double amount;

    public ElectricityConsumer(String consumerId, int unitConsumed, boolean peakHour) {
        this.consumerId = consumerId;
        UnitConsumed = unitConsumed;
        this.peakHour = peakHour;
    }

    public abstract void calculateBill();
    public abstract void applyPeakHourPenalty();
    public void generateBill(){
        System.out.println("Generating Bill");
        System.out.println("ConsumerId: " + consumerId);
        System.out.println("Consumed " + UnitConsumed + " units");
        System.out.println("Peak Hour " + peakHour);
    }

}
