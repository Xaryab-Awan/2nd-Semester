package Q4;
import java.util.*;
public class Route  implements Comparable<Route >{
    private int routeId;
    private List<String> stops;

    public Route(int routeId) {
        this.routeId = routeId;
        this.stops = new ArrayList<>();
    }

    public void addStop(String stop) {
        stops.add(stop);
    }

    public void removeStop(String stop) {
        stops.remove(stop);
    }

    @Override
    public int compareTo(Route other) {
        return Integer.compare(this.routeId, other.routeId);
    }
}
