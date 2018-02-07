package musta.belmo.designpatterns.decorator;

/**
 * Decorate the actual coffee by adding sugar into it.
 */
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee pCoffee) {

        super(pCoffee);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIngredients() {
        return mCoffee.getIngredients() + " and sugar";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 1;
    }
}
