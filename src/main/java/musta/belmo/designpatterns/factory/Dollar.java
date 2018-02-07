package musta.belmo.designpatterns.factory;

public class Dollar implements Currency {
    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "$";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLand() {
        return "USA";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double toDollar() {
        return 1.0;
    }
}
