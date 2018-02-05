package musta.belmo.designpatterns.decorator;

public class EmptyCoffee implements Coffee {
    @Override
    public String getIngredients() {
        return "";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
