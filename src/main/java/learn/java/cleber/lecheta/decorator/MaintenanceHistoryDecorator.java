package learn.java.cleber.lecheta.decorator;

import learn.java.cleber.lecheta.bike.MotorcycleInterface;

/**
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class MaintenanceHistoryDecorator {

    public StringBuilder observations = new StringBuilder();

    public final MotorcycleInterface myBike;

    MaintenanceHistoryDecorator(MotorcycleInterface bike) {
        this.myBike = bike;
    }

    public void addHistory(String history) {
        this.observations.append(history);
    }

    public String getHistory() {
        return this.observations.toString();
    }

    @Override
    public String toString() {
        return this.myBike.toString();
    }
}
