package learn.java.cleber.lecheta;

import learn.java.cleber.lecheta.bike.Cb500X;
import learn.java.cleber.lecheta.bike.Sh150;
import learn.java.cleber.lecheta.decorator.BagageiroXrTornado;
import learn.java.cleber.lecheta.decorator.Nx4MotardTunning;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("HELLO Honda Motorcycle World!\n");
        System.out.println("- " + new Sh150());

        BagageiroXrTornado tornadoDayByDay = new BagageiroXrTornado();
        System.out.println("- " + tornadoDayByDay);

        Nx4MotardTunning nx4Motard = new Nx4MotardTunning();
        System.out.println("- " + nx4Motard);

        System.out.println("- " + new Cb500X());
    }
}
