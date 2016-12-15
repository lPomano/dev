package com.company;

import FileWork.FileReader;
import Transport.*;
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
        FileReader.reader();
        Car car = new Car();
        Bus bus = new Bus();
        Bicycle bicycle = new Bicycle();
        OnFoot onFoot = new OnFoot();
        car.carTravel();
        bus.busTravel();
        bicycle.bicycleTravel();
        onFoot.onFootTravel();
    }
}
