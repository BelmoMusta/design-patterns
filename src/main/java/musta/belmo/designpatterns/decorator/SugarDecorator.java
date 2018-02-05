package musta.belmo.designpatterns.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee pCoffee) {

        super(pCoffee);
    }

    @Override
    public String getIngredients() {
        return mCoffee.getIngredients() + " and sugar";
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 1;
    }
}
