package Transport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static FileWork.FileReader.distance;

/**
 * Class Bicycle responsibles for the properties of the bicycle
 */
public class Bicycle {
    final double averageSpeed = 20;

    /**
     * Method bicycleTravel displays travel's time and cost
     */
    public void bicycleTravel() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double bicycleTime = distance / averageSpeed;
        System.out.println("Travel through our checkpoint by bicycle takes: " + f.format(bicycleTime*60) + " minutes");
        System.out.println("And it will be free");
    }
}
