package learn.java.cleber.lecheta;

import learn.java.cleber.lecheta.bike.Xr250;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Xr250Test {

    @Test
    void testMotorcycleIs() {
        String expected = "Honda TRAIL XR250 Tornado 250cc";
        String actual = new Xr250().toString();
        assertEquals(expected, actual, "motorcycle description must match factory pattern");
    }

}
