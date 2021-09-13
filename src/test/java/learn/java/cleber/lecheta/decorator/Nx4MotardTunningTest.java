package learn.java.cleber.lecheta.decorator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Nx4MotardTunningTest {

    private static Nx4MotardTunning nx4Motard;

    @BeforeAll
    static void setup() {
        nx4Motard = new Nx4MotardTunning();
    }

    @Test
    void testMotorcycleIs() {
        String expected = "Honda ADVENTURE NX4 Falcon 400cc";
        String actual = nx4Motard.toString();
        assertTrue(actual.startsWith(expected), "motorcycle description must match factory pattern");
    }

    @Test
    void testAccessories() {
        assertNotNull(nx4Motard.getAccessories());
        assertTrue(nx4Motard.getAccessories().size()==4);

        String expected = "[Protetor De Motor Slider Super Adventure, Roda de liga leve c/ pneu CB500, Pintura quadro e partes metátlicas (cinza/vermelho), Remanufatura do motor para 440cc]";
        String actual = nx4Motard.getAccessories().toString();
        assertEquals(expected, actual, "accessories list must mach the dream, the vision!");
    }

}
