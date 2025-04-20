package Q12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TradingEngine engine = new AlgoTrader();
        TradingEngine engine1= new HumanTrader();
        engine.placeOrder();
        engine.runRiskChecks();
        engine1.runRiskChecks();
        engine1.placeOrder();
        ArrayList<TradingEngine> engines = new ArrayList<>();
        engines.add(engine);
        engines.add(engine1);
        for(TradingEngine engine2 : engines) {
            engine2.placeOrder();
        }
    }
}
