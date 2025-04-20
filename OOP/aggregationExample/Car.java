package aggregationExample;

import aggregationExample.Passengers;
import java.util.ArrayList;
public class Car {
    private String CarName;
    ArrayList<Passengers> passengers;
    Car(String CarName)
    {
        this.CarName=CarName;
        passengers=new ArrayList<>();
    }
}
