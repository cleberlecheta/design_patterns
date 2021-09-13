package learn.java.cleber.lecheta;

import learn.java.cleber.lecheta.bike.Nx4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Nx4Test {

    @Test
    void testMotorcycleIs() {
        String expected = "Honda ADVENTURE NX4 Falcon 400cc";
        String actual = new Nx4().toString();
        assertEquals(expected, actual, "motorcycle description must match factory pattern");
    }

}
