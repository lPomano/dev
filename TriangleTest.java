package triangle;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    private double a;
    private double b;
    private double c;

    Triangle trio = new Triangle(a, b, c);

    @Test
    public void triangleWithThreeSameSidesTest() {
        Assert.assertEquals("THREESIDES", trio.triangleCheck(1,1,1));
    }

    @Test
    public void triangleWithTwoSameSidesTestOne() {
        Assert.assertEquals("TWOSIDES", trio.triangleCheck(2,2,3));
    }

    @Test
    public void triangleWithTwoSameSidesTestTwo() {
        Assert.assertEquals("TWOSIDES", trio.triangleCheck(2,3,2));
    }

    @Test
    public void triangleWithTwoSameSidesTestThree() {
        Assert.assertEquals("TWOSIDES", trio.triangleCheck(3,2,2));
    }

    @Test
    public void singleTriangleTest() {
        Assert.assertEquals("SINGLE", trio.triangleCheck(3,4,5));
    }

    @Test
    public void sumSidesCheckNegativeTest() {
        a = 4;
        b = 4;
        c = 8;
        Assert.assertFalse(trio.sumSidesCheck());
    }

    @Test
    public void sidesCheckNegativeTest() {
        a = -3;
        b = 4;
        c = 8;
        Assert.assertFalse(trio.sidesCheck());
    }

    @Test
    public void sidesCheckSideIsZeroTest() {
        a = 0;
        b = 4;
        c = 8;
        Assert.assertFalse(trio.sidesCheck());
    }
}