import java.util.ArrayList;

/**
 *  Class finds the distance of travel.
 */
public class Route {
    private ArrayList<Point> route;
    /**
     * Constructor of the Route.
     */
    public Route(ArrayList<Point> route) {
        this.route = route;
    }
    /**
     * Method return distance of the travel.
     */
    public double getDistance(){
        int j = 1;
        double distance = 0;
        for (int i = 0; i < route.size() - 1; i++){
            double x = (route.get(j).getX() - route.get(i).getX())*(route.get(j).getX() - route.get(i).getX());
            double y = (route.get(j).getY() - route.get(i).getY())*(route.get(j).getY() - route.get(i).getY());
            distance += Math.sqrt(x + y);
            j++;
        }
        return distance;
    }
}
