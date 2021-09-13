package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.BikeStyleEnum;
import learn.java.cleber.lecheta.bike.Nx4;
import learn.java.cleber.lecheta.bike.Xr250;

import java.util.List;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class BagageiroXrTornado extends BikePartsDecorator {

    public BagageiroXrTornado() {
        super(new Xr250());
        this.acessories.add("Bagageiro Xr250 Tornado Preto Polimet");
    }

    @Override
    public List<String> getAccessories() {
        return this.acessories;
    }

    @Override
    public String getModelName() {
        return super.myBike.getModelName();
    }

    @Override
    public String getNickname() {
        return super.myBike.getNickname();
    }

    @Override
    public Integer getCubicCentimeters() {
        return super.myBike.getCubicCentimeters();
    }

    @Override
    public BikeStyleEnum getStyle() {
        return super.myBike.getStyle();
    }
}
