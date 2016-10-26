package Transport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static FileWork.FileReader.distance;

/**
 * Class Bus responsibles for the properties of the bus
 */
public class Bus {
    final double averageSpeed = 60;
    final double fuelConsumption = 25;
    final double fuelCost = 0.58;
    final double passengersQuantity = 20;

    /**
     * Method busTravel displays travel's time and cost
     */
    public void busTravel() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double busTime = distance / averageSpeed;
        System.out.println("Travel through our checkpoint by bus takes: " + f.format(busTime * 60) + " minutes");
        double travelCost = ((distance / fuelConsumption) * fuelCost) / passengersQuantity;
        System.out.println("And it will cost: " + f.format(travelCost) + "$" + " for every person" + "\n");
    }
}
