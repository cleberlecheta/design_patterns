package learn.java.cleber.lecheta;

import learn.java.cleber.lecheta.bike.Sh150;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Sh150Test {

    @Test
    void testMotorcycleIs() {
        String expected = "Honda STREET SH150 150cc";
        String actual = new Sh150().toString();
        assertEquals(expected, actual, "motorcycle description must match factory pattern");
    }

}
