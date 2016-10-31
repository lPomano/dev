package com.company.company.Transport;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testCarTravel() {
        Car car = new Car();
        Assert.assertEquals(car.carTravel(), 1.0, 0.01);
    }
    @Test
    public void testCarTravelCost() {
        Car car = new Car();
        Assert.assertEquals(car.carTravelCost(), 1.0, 0.01);
    }
}