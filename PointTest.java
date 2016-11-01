import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testGetX() throws Exception {
        Point point = new Point(12, 3);
        Assert.assertEquals(12, point.getX(), 0.01);
    }

    @Test
    public void testGetY() throws Exception {
        Point point = new Point(12, 3);
        Assert.assertEquals(3, point.getY(), 0.01);
    }
    @Test
    public void negativeTestGetX() throws Exception {
        Point point = new Point(12, 3);
        Assert.assertNotEquals(23232, point.getX(), 0.01);
    }

    @Test
    public void negativeTestGetY() throws Exception {
        Point point = new Point(12, 3);
        Assert.assertNotEquals(2222, point.getY(), 0.01);
    }
}