package learn.java.cleber.lecheta.bike;

import learn.java.cleber.lecheta.bike.BikeStyleEnum;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public interface MotorcycleInterface {
    String brand = "Honda";

    String getModelName();
    Integer getCubicCentimeters();
    BikeStyleEnum getStyle();

}
