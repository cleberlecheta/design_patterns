package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.MotorcycleInterface;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class BikeMaintenanceHistory extends MaintenanceHistoryDecorator {

    public BikeMaintenanceHistory(MotorcycleInterface bike, StringBuilder observations) {
        super(bike);
        this.observations = observations;
    }

}
