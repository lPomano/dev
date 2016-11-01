/**
 * Class Transport create the character of the transports.
 */
public class Transport {
    private double speed;
    private double passengerAmount;
    private double fuel;
    private TransportKind kind;
    /**
     * Constructor of the Transport.
     */
    public Transport(double speed, double count, double fuel, TransportKind kind) {
        this.speed = speed;
        this.passengerAmount = count;
        this.fuel = fuel;
        this.kind = kind;
    }
    /**
     * Method return speed of transport.
     */
    public double getSpeed() {
        return speed;
    }
    /**
     * Method return amount passengers of transport.
     */
    public double getPassengerAmount() {
        return passengerAmount;
    }
    /**
     * Method return amount fuel of transport.
     */
    public double getFuel() {
        return fuel;
    }
    /**
     * Method return kind of transport.
     */
    public TransportKind getKind() {
        return kind;
    }
}
