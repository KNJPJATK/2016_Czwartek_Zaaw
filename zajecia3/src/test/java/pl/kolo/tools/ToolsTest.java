package pl.kolo.tools;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by rpi on 27.10.2016.
 */
public class ToolsTest {

    @Before
    public void setup() {
        System.err.println("Setup");
    }

    @AfterClass
    public static void tearUp() {
        System.err.println("tearUp");
    }

    @Test(expected = AssertionError.class)
    public void testSqrt() {
        assertEquals(0, Tools.sqrt(0));
        assertEquals(1, Tools.sqrt(1));
        assertEquals(4, Tools.sqrt(2));
        assertTrue("Wywalony", false);
    }

    @Test
    public void testGet3() {
        Tools t = Mockito.mock(Tools.class);
        Mockito.when(t.get3()).thenReturn(3);
        assertEquals(3, t.get3());
    }

    @Test
    public void test() {
        fail();
    }

}
