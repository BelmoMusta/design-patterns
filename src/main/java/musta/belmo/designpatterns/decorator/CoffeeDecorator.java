package musta.belmo.designpatterns.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee mCoffee;

    /**
     * Constructor of the CoffeeDecorator class.
     *
     * @param coffee the coffee instance
     */
    public CoffeeDecorator(Coffee coffee) {
        this.mCoffee = coffee;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIngredients() {
        return mCoffee.getIngredients();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPrice() {
        return mCoffee.getPrice();
    }
}
