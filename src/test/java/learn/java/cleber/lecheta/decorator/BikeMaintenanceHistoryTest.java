package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.MotorcycleInterface;
import learn.java.cleber.lecheta.bike.Nx4;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class BikeMaintenanceHistoryTest {

    private static BagageiroXrTornado tornadoDayByDay;

    @BeforeAll
    static void setup() {
        tornadoDayByDay = new BagageiroXrTornado();
    }

    @Test
    void testAddHistory() {
        StringBuilder observations = new StringBuilder();
        observations.append("   XTire anti puncture vaccine on two wells\n");
        observations.append("   Iridium candle\n");
        observations.append("   new (original) lens on turn signals\n");
        observations.append("   carb cleaning\n");
        observations.append("   new (original) transmission relation\n");
        observations.append("   motor oil change at each 1.000km - 20W50 semi synthetic\n");

        BikeMaintenanceHistory xrTornadoWithHistory = new BikeMaintenanceHistory(tornadoDayByDay, observations);
        assertNotNull(xrTornadoWithHistory.observations, "must be already instantiated");
        assertEquals(observations.toString(), xrTornadoWithHistory.getHistory(), "must have the bike history");

        System.out.println("- " + xrTornadoWithHistory);
        System.out.println(xrTornadoWithHistory.getHistory());
    }

    @Test
    void testBike() {
        MotorcycleInterface NX4 = new Nx4();
        StringBuilder observations = new StringBuilder();
        observations.append("   new oil 20W50 semi synthetic\n");
        BikeMaintenanceHistory nx4withHistory = new BikeMaintenanceHistory(NX4, observations);
        assertEquals(NX4.toString(), nx4withHistory.toString(), "bike description should be unchanged");
        assertNotNull(nx4withHistory.observations, "must be already instantiated");
        assertEquals(observations.toString(), nx4withHistory.getHistory(), "must have the bike history");

        System.out.println("- " + nx4withHistory);
        System.out.println(nx4withHistory.getHistory());
    }

    @Test
    void testBikeWithParts() {
        MotorcycleInterface nx4Motard = new Nx4MotardTunning();
        StringBuilder observations = new StringBuilder();
        observations.append("   carb revision\n");
        BikeMaintenanceHistory nx4withHistory = new BikeMaintenanceHistory(nx4Motard, observations);
        assertEquals(nx4Motard.toString(), nx4withHistory.toString(), "bike description should be unchanged");
        assertNotNull(nx4withHistory.observations, "must be already instantiated");
        assertEquals(observations.toString(), nx4withHistory.getHistory(), "must have the bike history");

        System.out.println("- " + nx4withHistory);
        System.out.println(nx4withHistory.getHistory());
    }

    @Test
    void addExtraInformationHistory() {
        MotorcycleInterface NX4 = new Nx4();
        StringBuilder observations = new StringBuilder();
        observations.append("   new oil 20W50 semi synthetic\n");
        BikeMaintenanceHistory nx4withHistory = new BikeMaintenanceHistory(NX4, observations);

        assertEquals(NX4.toString(), nx4withHistory.toString(), "bike description should be unchanged");
        assertNotNull(nx4withHistory.observations, "must be already instantiated");
        assertEquals(observations.toString(), nx4withHistory.getHistory(), "must have the bike history");

        nx4withHistory.addHistory("   carb clean\n");
        nx4withHistory.addHistory("   candle change\n");

        assertEquals(observations.toString(), nx4withHistory.getHistory(), "must have the entire bike history");

        System.out.println("- " + nx4withHistory);
        System.out.println(nx4withHistory.getHistory());
    }

}
