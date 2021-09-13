package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.AbstractBike;
import learn.java.cleber.lecheta.bike.MotorcycleInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * We have our Honda motorcycles done in our project
 * Sh150, Xr250, Nx4 and Cb500X
 *
 * Now let's add some interesting parts to them
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public abstract class BikePartsDecorator implements MotorcycleInterface {

    protected List<String> acessories = new ArrayList();

    /** Motorcycle decorated */
    public final MotorcycleInterface myBike;

    public BikePartsDecorator(MotorcycleInterface bike){
        this.myBike = bike;
    }

    abstract List<String> getAccessories(); //this may be defined in the interface as well

    @Override
    public String toString() {
        return myBike.toString() + AbstractBike.SPACE + getAccessories();
    }
}
