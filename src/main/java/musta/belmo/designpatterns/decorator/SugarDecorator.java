package musta.belmo.designpatterns.decorator;

/**
 * Decorate the actual coffee by adding sugar into it.
 */
public class SugarDecorator extends CoffeeDecorator {

    private static final int SUGAR_PRICE = 1;

    public SugarDecorator(Coffee pCoffee) {
        super(pCoffee);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + " and sugar";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrice() {
        return super.getPrice() + SUGAR_PRICE;
    }
}
