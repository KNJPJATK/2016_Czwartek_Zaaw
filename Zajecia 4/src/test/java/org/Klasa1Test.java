package org;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import pl.Klasa1;

import static org.junit.Assert.*;

/**
 * Created by rpi on 03.11.16.
 */
public class Klasa1Test {

    private Klasa1 klasa1;

    @Before
    public void setup() {
        klasa1 = Mockito.mock(Klasa1.class);
//        System.err.println(klasa1.getClass().getSimpleName());
        Mockito.when(klasa1.get2()).thenReturn(2);
        Mockito.when(klasa1.get8()).thenReturn(8);
        Mockito.when(klasa1.getIncreased(1)).thenReturn(0);
        klasa1.metodaKtoraNicNieZwraca();
    }

    @Test
    public void get2Test() {
        assertEquals(2, klasa1.get2());
    }

    @Test
    public void get8Test() {
        assertEquals(8, klasa1.get8());
    }

    @Test
    public void getIncreasedTest() {
        assertEquals(0, klasa1.getIncreased(5));
    }

}
