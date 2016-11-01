import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class RouteTest {
    @DataProvider(name = "Points")
    public Object[][] getPoints() {
        return new Object[][]{
                {10.0,new Point(0.0, 0.0),new Point(10.0, 0.0)},
                {10.0,new Point(10.0, 0.0),new Point(10.0, 10.0)},
                {10.0,new Point(10.0, 10.0),new Point(0.0, 10.0)},
        };
    }
    @Test(dataProvider = "Points")
    public void testGetDistance(double expected, Point x, Point y) {
        ArrayList<Point> rt = new ArrayList<Point>();
        Route route = new Route(rt);
        rt.add(x);
        rt.add(y);
        double result = route.getDistance();
        Assert.assertEquals(result, expected);
    }
    @DataProvider(name = "NegativePoints")
    public Object[][] getNegativePoints() {
        return new Object[][]{
                {30.0, new Point(0.0, 0.0), new Point(10.0, 0.0)},
                {30.0, new Point(10.0, 0.0), new Point(10.0, 10.0)},
                {30.0, new Point(10.0, 10.0), new Point(0.0, 10.0)},
        };
    }
    @Test(dataProvider = "NegativePoints")
    public void negativeTestGetDistance(double expected, Point x, Point y) {
        ArrayList<Point> rt = new ArrayList<Point>();
        Route route = new Route(rt);
        rt.add(x);
        rt.add(y);
        double result = route.getDistance();
        Assert.assertNotEquals(result, expected);
    }
}