/**
 * Class finds and displays statistics for each type of transport.
 */
public class Statistics {
    private static final int HUNDRED = 100;
    private static final double FUEL_COST = 10;
    /**
     * Method finds and return new statistics for each type of transport.
     */
    public static Metrics getMetrics(Transport transport, double distance){
        double time = distance / transport.getSpeed();
        double cost = ((distance * transport.getFuel() / HUNDRED) * FUEL_COST) / transport.getPassengerAmount();
        return new Metrics(cost, time, transport.getKind());
    }
    /**
     * Method displays statistics for each type of transport.
     */
    public static void showStatistics(Transport transport, double distance){
        Metrics metrics = getMetrics(transport, distance);
        System.out.println("Type of transport " + metrics.getKind().toString() + " :\nTime in route = " + metrics.getTime() + "\nCost of path = " + metrics.getCost());
    }
}
