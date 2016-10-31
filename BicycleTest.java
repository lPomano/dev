package com.company.company.Transport;

import org.junit.Assert;
import org.junit.Test;

public class BicycleTest {
    @Test
    public void testBicycleTravel() {
        Bicycle bicycle = new Bicycle();
        Assert.assertEquals(bicycle.bicycleTravel(), 1.0, 0.01);
    }
}