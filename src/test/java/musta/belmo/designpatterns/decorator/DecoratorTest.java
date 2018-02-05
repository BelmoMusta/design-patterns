package musta.belmo.designpatterns.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Coffee mCoffee = new EmptyCoffee();
        mCoffee = new NormalCoffee();
        showCafe(mCoffee);
        mCoffee = new MilkDecorator(mCoffee);
        showCafe(mCoffee);
        mCoffee = new SugarDecorator(mCoffee);
        showCafe(mCoffee);

    }

    private   void showCafe(Coffee coffee) {

        System.out.println("ingredients : " + coffee.getIngredients());
        System.out.println("prix : " + coffee.getPrice());
        System.out.println("==============");
    }
}
