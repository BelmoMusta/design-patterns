package musta.belmo.designpatterns.decorator;

/**
 * a normal coffee without any other ingredients.
 */
public class NormalCoffee implements Coffee {

    private static final int NORMAL_PRICE = 2;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIngredients() {
        return " normal coffee";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrice() {
        return NORMAL_PRICE;
    }
}
