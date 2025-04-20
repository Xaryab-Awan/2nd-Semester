package Q1;

import java.util.*;
public class Route implements Comparable<Route> {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Route route = (Route) obj;
        return routeId == route.routeId && stops.equals(route.stops);
    }
}
