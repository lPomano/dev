import org.testng.Assert;
import org.testng.annotations.Test;

public class TransportTest {

    Transport transport = new Transport(2.0, 3.0, 4.0, TransportKind.BIKE);

    @Test
    public void testGetSpeed() throws Exception {
        Assert.assertEquals(2.0, transport.getSpeed(), 0.01);
    }
    @Test
    public void testGetPassengerAmount() throws Exception {
        Assert.assertEquals(3.0, transport.getPassengerAmount(), 0.01);
    }

    @Test
    public void testGetFuel() throws Exception {
        Assert.assertEquals(4.0, transport.getFuel(), 0.01);
    }

    @Test
    public void testGetKind() throws Exception {
        Assert.assertSame(TransportKind.BIKE , transport.getKind());
    }
    @Test
    public void NegativeTestGetSpeed() throws Exception {
        Assert.assertNotEquals(222222.0, transport.getSpeed(), 0.01);
    }
    @Test
    public void NegativeTestGetPassengerAmount() throws Exception {
        Assert.assertNotEquals(23123123.0, transport.getPassengerAmount(), 0.01);
    }

    @Test
    public void NegativeTestGetFuel() throws Exception {
        Assert.assertNotEquals(23123123.0, transport.getFuel(), 0.01);
    }
}