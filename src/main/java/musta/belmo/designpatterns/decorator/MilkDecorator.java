package musta.belmo.designpatterns.decorator;

/**
 * Decorate the actual coffee by adding milk into it.
 */
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee pCoffee) {
        super(pCoffee);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIngredients() {
        return mCoffee.getIngredients() + " and milk";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 2;
    }
}
