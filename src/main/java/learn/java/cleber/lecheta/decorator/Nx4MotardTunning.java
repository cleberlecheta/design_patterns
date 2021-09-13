package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.BikeStyleEnum;
import learn.java.cleber.lecheta.bike.Nx4;

import java.util.List;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class Nx4MotardTunning extends BikePartsDecorator {

    public Nx4MotardTunning() {
        super(new Nx4());
        this.acessories.add("Protetor De Motor Slider Super Adventure");
        this.acessories.add("Roda de liga leve c/ pneu CB500");
        this.acessories.add("Pintura quadro e partes metátlicas (cinza/vermelho)");
        this.acessories.add("Remanufatura do motor para 440cc");
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
