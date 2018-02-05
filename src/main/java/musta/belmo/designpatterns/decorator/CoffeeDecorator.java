package musta.belmo.designpatterns.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee mCoffee;

    public CoffeeDecorator(Coffee pCoffee) {
        this.mCoffee = pCoffee;
    }

    @Override
    public String getIngredients() {
        return mCoffee.getIngredients();
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice();
    }
}
