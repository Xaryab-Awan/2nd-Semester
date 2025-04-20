package Q12;

public class AlgoTrader implements TradingEngine, ComplianceEngine {
    public void placeOrder(){
        System.out.println("Order placed");
    }
    public void runRiskChecks(){
        System.out.println("Running Risk Checks");
    }
    public void generateReport(){
        System.out.println("Generating report");
    }
    public void logAuditTrail(){
        System.out.println("Logging audit trail");

    }
}
