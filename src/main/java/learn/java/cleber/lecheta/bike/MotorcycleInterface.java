package learn.java.cleber.lecheta.bike;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public interface MotorcycleInterface {
    String brand = "Honda";

    String getModelName();

    String getNickname();

    Integer getCubicCentimeters();

    BikeStyleEnum getStyle();

}
