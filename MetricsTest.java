import org.testng.Assert;
import org.testng.annotations.Test;


public class MetricsTest {

    Metrics metrics = new Metrics(12.0, 3.0, TransportKind.BIKE);

    @Test
    public void testGetCost() throws Exception {
        Assert.assertEquals(12.0, metrics.getCost(), 0.01);
    }

    @Test
    public void testGetTime() throws Exception {
        Assert.assertEquals(3.0, metrics.getTime(), 0.01);
    }

    @Test
    public void testGetKind() throws Exception {
        Assert.assertSame(TransportKind.BIKE, metrics.getKind());
    }
    @Test
    public void negativeTestCost() throws Exception {
        Assert.assertNotEquals(222222.0, metrics.getCost(), 0.01);
    }

    @Test
    public void negativeTestGetTime() throws Exception {
        Assert.assertNotEquals(2223123.0, metrics.getTime(), 0.01);
    }
}