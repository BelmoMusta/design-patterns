package musta.belmo.designpatterns.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee pCoffee) {
        super(pCoffee);
    }

    @Override
    public String getIngredients() {
        return mCoffee.getIngredients() + " and milk";
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 2;
    }
}
