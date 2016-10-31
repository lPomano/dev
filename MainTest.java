package com.company.company;

import com.company.company.Transport.Bicycle;
import com.company.company.Transport.Bus;
import com.company.company.Transport.Car;
import com.company.company.Transport.OnFoot;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
   @Test
    public void testMain(){
        Car car = new Car();
        Assert.assertEquals(car, car);
    }
    @Test
    public void testMain1(){
        Bus bus = new Bus();
        Assert.assertEquals(bus, bus);
    }
    @Test
    public void testMain2(){
        Bicycle bicycle = new Bicycle();
        Assert.assertEquals(bicycle, bicycle);
    }
    @Test
    public void testMain3(){
        OnFoot onFoot = new OnFoot();
        Assert.assertEquals(onFoot, onFoot);
    }
}