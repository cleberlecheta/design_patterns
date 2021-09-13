package learn.java.cleber.lecheta;

import learn.java.cleber.lecheta.bike.Cb500X;
import learn.java.cleber.lecheta.bike.Sh150;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Cb500Test {

    @Test
    void testMotorcycleIs() {
        String expected = "Honda ADVENTURE CB500X 500cc";
        String actual = new Cb500X().toString();
        assertEquals(expected, actual, "motorcycle description must match factory pattern");
    }

}
