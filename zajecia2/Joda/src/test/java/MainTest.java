import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rpi on 20.10.2016.
 */
public class MainTest {

    @Test
    public void testIsTrue() {
        Assert.assertTrue(Main.isTrue(Boolean.TRUE));
        Assert.assertFalse(Main.isTrue(Boolean.FALSE));
    }

}
