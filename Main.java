package com.company.company;

import com.company.company.FileReader.FileWork;
import com.company.company.Transport.Bicycle;
import com.company.company.Transport.Bus;
import com.company.company.Transport.Car;
import com.company.company.Transport.OnFoot;
import java.io.IOException;

/**
 * Program's entery point
 */
public class Main {

    /**
     * Method main works with other classes and methods
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileWork.reader();
        Car car = new Car();
        Bus bus = new Bus();
        Bicycle bicycle = new Bicycle();
        OnFoot onFoot = new OnFoot();
        car.carTravel();
        car.carTravelCost();
        bus.busTravel();
        bus.busTravelCost();
        bicycle.bicycleTravel();
        onFoot.onFootTravel();
    }
}