package musta.belmo.designpatterns.factory;

public class Euro implements Currency {
    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "Euro";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLand() {
        return "Europe";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double toDollar() {
        return 1.2;
    }
}
