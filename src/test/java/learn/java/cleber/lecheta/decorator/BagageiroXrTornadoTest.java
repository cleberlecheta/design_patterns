package learn.java.cleber.lecheta.decorator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class BagageiroXrTornadoTest {

    private static BagageiroXrTornado tornadoDayByDay;

    @BeforeAll
    static void setup() {
        tornadoDayByDay = new BagageiroXrTornado();
    }

    @Test
    void testMotorcycleIs() {
        String expected = "Honda TRAIL XR250 Tornado 250cc";
        String actual = tornadoDayByDay.toString();
        assertTrue(actual.startsWith(expected), "motorcycle description must match factory pattern");
    }

    @Test
    void testAccessories() {
        assertNotNull(tornadoDayByDay.getAccessories());
        assertTrue(tornadoDayByDay.getAccessories().size() == 1);

        String expected = "[Bagageiro Xr250 Tornado Preto Polimet]";
        String actual = tornadoDayByDay.getAccessories().toString();
        assertEquals(expected, actual, "accessories list must mach the installed ones");
    }

}
