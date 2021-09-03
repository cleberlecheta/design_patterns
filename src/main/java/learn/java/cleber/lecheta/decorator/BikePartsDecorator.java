package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.AbstractBike;
import learn.java.cleber.lecheta.bike.MotorcycleInterface;

/**
 * We have our Honda motorcycles done in our project
 * Sh150, Xr250, Nx4 and Cb500X
 *
 * Now let's add some interesting parts to them
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public abstract class BikePartsDecorator extends AbstractBike {

    /** Motorcycle decorated */
    private final MotorcycleInterface myBike;

    public BikePartsDecorator(MotorcycleInterface bike){
        this.myBike = bike;
    }

    abstract String getAccessories(); //this may be defined in the interface as well
}
