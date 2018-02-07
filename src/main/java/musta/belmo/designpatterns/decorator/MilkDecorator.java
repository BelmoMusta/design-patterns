package musta.belmo.designpatterns.decorator;

/**
 * Decorate the actual coffee by adding milk into it.
 */
public class MilkDecorator extends CoffeeDecorator {

    private static final int MILK_PRICE = 2;

    public MilkDecorator(Coffee pCoffee) {
        super(pCoffee);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + " and milk";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrice() {
        return super.getPrice() + MILK_PRICE;
    }
}
