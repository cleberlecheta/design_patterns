package learn.java.cleber.lecheta.bike;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Sh150 extends AbstractBike {

    @Override
    public Integer getCubicCentimeters() {
        return 150;
    }

    @Override
    public BikeStyleEnum getStyle() {
        return BikeStyleEnum.STREET;
    }
}
