package com.company.company.Transport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import com.company.company.FileReader.FileWork;

/**
 * Class Bicycle responsibles for the properties of the bicycle
 */
public class Bicycle {
    private final double averageSpeed = 20;
    double bicycleTime;

    /**
     * Method bicycleTravel displays travel's time and cost
     */
    public double bicycleTravel() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        bicycleTime = FileWork.distance / averageSpeed;
        System.out.println("Travel through our checkpoint by bicycle takes: " + f.format(bicycleTime*60) + " minutes");
        System.out.println("And it will be free" + "\n");
        bicycleTime = 1;
        return bicycleTime;
    }
}