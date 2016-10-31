package com.company.company.Transport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import com.company.company.FileReader.FileWork;

/**
 * Class Car responsibles for the properties of the car
 */
public class Car {
    final double averageSpeed = 90;
    final double fuelConsumption = 15;
    final double fuelCost = 0.61;
    final double passengersQuantity = 1;

    /**
     * Method carTravel displays travel's time and cost
     */
    public double carTravel() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double carTime = FileWork.distance / averageSpeed;
        System.out.println("Travel through our checkpoint by car takes: " + f.format(carTime * 60) + " minutes");
        carTime = 1;
        return carTime;
    }
    public double carTravelCost() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        double travelCost = ((FileWork.distance  / fuelConsumption) * fuelCost) / passengersQuantity;
        System.out.println("And it will cost: " + f.format(travelCost) + "$" + " for you" + "\n");
        travelCost = 1;
        return travelCost;
    }
}