package learn.java.cleber.lecheta;

import learn.java.cleber.lecheta.bike.Cb500X;
import learn.java.cleber.lecheta.bike.Sh150;
import learn.java.cleber.lecheta.decorator.BagageiroXrTornado;
import learn.java.cleber.lecheta.decorator.Nx4MotardTunning;
import learn.java.cleber.lecheta.decorator.BikeMaintenanceHistory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("HELLO Honda Motorcycle World!\n");
        System.out.println("- " + new Sh150());

        StringBuilder observations = new StringBuilder();
        observations.append("   XTire anti puncture vaccine on two wells\n");
        observations.append("   Iridium candle\n");
        observations.append("   new (original) lens on turn signals\n");
        observations.append("   carb cleaning\n");
        observations.append("   new (original) transmission relation\n");
        observations.append("   motor oil change at each 1.000km - 20W50 semi synthetic\n");
        BikeMaintenanceHistory tornadoDayByDay = new BikeMaintenanceHistory(new BagageiroXrTornado(), observations);
        System.out.println("- " + tornadoDayByDay);
        System.out.println(tornadoDayByDay.getHistory());

        Nx4MotardTunning nx4Motard = new Nx4MotardTunning();
        System.out.println("- " + nx4Motard);

        System.out.println("- " + new Cb500X());
    }
}
