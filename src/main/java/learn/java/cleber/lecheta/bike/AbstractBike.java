package learn.java.cleber.lecheta.bike;

import java.util.Locale;

/**
 * We could direct implement the MotorcycleInterface, but we
 * decided to create a common class to add some facilities
 * to all concrete motorcycle classes.
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public abstract class AbstractBike implements MotorcycleInterface {

    public static final String SPACE = " ";

    public String getNickname() {
        return "";
    };

    @Override
    public String getModelName() {
        return this.getClass().getSimpleName().toUpperCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(brand).append(SPACE)
                .append(getStyle()).append(SPACE)
                .append(getModelName()).append(SPACE);

        if (getNickname().length()>0) {
            sb.append(getNickname()).append(SPACE);
        }

        sb.append(getCubicCentimeters()).append("cc");
        return sb.toString();
    }
}
