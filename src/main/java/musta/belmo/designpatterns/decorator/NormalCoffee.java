package musta.belmo.designpatterns.decorator;

/**
 * a normal coffee without any other ingredients.
 */
public class NormalCoffee implements Coffee {
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
        return 2;
    }
}
