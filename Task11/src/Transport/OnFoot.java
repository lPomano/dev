package Transport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static FileWork.FileReader.distance;

/**
 * Class OnFoot responsibles for the properties of the human
 */
public class OnFoot {
    final double averageSpeed = 3;

    /**
     * Method onFootTravel displays travel's time and cost
     */
    public void onFootTravel() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double onFootTime = distance / averageSpeed;
        System.out.println("Travel through our checkpoint by foots takes: " + f.format(onFootTime*60) + " minutes");
        System.out.println("And it will be free");
    }
}
