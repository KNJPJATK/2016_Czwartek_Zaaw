import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Created by rpi on 03.11.16.
 */
public class Test {

    @org.junit.Test
    public void test1() {
//        Assert.assertTrue(true);
//        Assert.assertEquals(2, 2);
//        Assert.assertFalse(true);
        System.err.println("Test pierwszy");
    }

    @org.junit.Test
    public void test2() {
        System.err.println("Test drugi");
    }

    @Before
    public void setup() {
        System.err.println
                ("Dzieje sie przed każdym testem");
    }

    @BeforeClass
    public static void classSetup() {
        System.err.println
                ("Dzieje się przed wszystkimi testami");
    }

}
