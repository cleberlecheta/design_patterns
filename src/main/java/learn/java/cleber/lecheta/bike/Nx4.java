package learn.java.cleber.lecheta.bike;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Nx4 extends AbstractBike {

    @Override
    public String getNickname() {
        return "Falcon";
    }

    @Override
    public Integer getCubicCentimeters() {
        return 400;
    }

    @Override
    public BikeStyleEnum getStyle() {
        return BikeStyleEnum.ADVENTURE;
    }
}
