package com.company.company.Transport;

import org.junit.Assert;
import org.junit.Test;

public class BusTest {
    @Test
    public void testBusTravel() {
        Bus bus = new Bus();
        Assert.assertEquals(bus.busTravel(), 1.0, 0.01);
    }
    @Test
    public void testBusTravelCost() {
        Bus bus = new Bus();
        Assert.assertEquals(bus.busTravelCost(), 1.0, 0.01);
    }
}