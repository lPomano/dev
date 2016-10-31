package com.company.company.Transport;

import org.junit.Assert;
import org.junit.Test;

public class OnFootTest {
    @Test
    public void testOnFoot() {
        OnFoot onFoot = new OnFoot();
        Assert.assertEquals(onFoot.onFootTravel(), 1.0, 0.01);
    }
}