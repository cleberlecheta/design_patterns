package learn.java.cleber.lecheta.bike;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Xr250 extends AbstractBike {

    @Override
    public String getNickname() {
        return "Tornado";
    }

    @Override
    public Integer getCubicCentimeters() {
        return 250;
    }

    @Override
    public BikeStyleEnum getStyle() {
        return BikeStyleEnum.TRAIL;
    }
}
