package musta.belmo.designpatterns.factory;

public class MAD implements Currency {
    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "MAD";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLand() {
        return "Morocco";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double toDollar() {
        return 9.8;
    }
}
