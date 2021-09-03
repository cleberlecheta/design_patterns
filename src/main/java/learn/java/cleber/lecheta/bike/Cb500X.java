package learn.java.cleber.lecheta.bike;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Cb500X extends AbstractBike {

    @Override
    public Integer getCubicCentimeters() {
        return 500;
    }

    @Override
    public BikeStyleEnum getStyle() {
        return BikeStyleEnum.ADVENTURE;
    }
}
