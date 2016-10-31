package com.company.company.Transport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import com.company.company.FileReader.FileWork;

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
    public double busTravel() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double busTime = FileWork.distance / averageSpeed;
        System.out.println("Travel through our checkpoint by bus takes: " + f.format(busTime * 60) + " minutes");
        busTime = 1;
        return busTime;
    }
    public double busTravelCost() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double travelCost = ((FileWork.distance / fuelConsumption) * fuelCost) / passengersQuantity;
        System.out.println("And it will cost: " + f.format(travelCost) + "$" + " for every person" + "\n");
        travelCost = 1;
        return travelCost;
    }
}