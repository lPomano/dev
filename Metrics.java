/**
 * Class Metrics return statistics for each type of transports for the travel.
 */
public class Metrics {
    private double cost;
    private double time;
    private TransportKind kind;
    /**
     * Constructor of the Metrics.
     */
    public Metrics(double cost, double time, TransportKind kind) {
        this.cost = cost;
        this.time = time;
        this.kind = kind;
    }
    /**
     * Method return cost of travel.
     */
    public double getCost() {
        return cost;
    }
    /**
     * Method return time of travel.
     */
    public double getTime() {
        return time;
    }
    /**
     * Method return kind of transport for the travel.
     */
    public TransportKind getKind() {
        return kind;
    }
}
