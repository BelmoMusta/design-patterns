package musta.belmo.designpatterns.decorator;

public class NormalCoffee implements Coffee {
    @Override
    public String getIngredients() {
        return " normal coffee";
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
