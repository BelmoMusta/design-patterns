package musta.belmo.designpatterns.decorator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Coffee mCoffee = new EmptyCoffee();
        showCoffee(mCoffee);
        assertEquals(0,mCoffee.getPrice());
        mCoffee = new NormalCoffee();
        showCoffee(mCoffee);
        assertEquals(2,mCoffee.getPrice());
        mCoffee = new MilkDecorator(mCoffee);
        showCoffee(mCoffee);
        assertEquals(4,mCoffee.getPrice());
        mCoffee = new SugarDecorator(mCoffee);
        showCoffee(mCoffee);
        assertEquals(5,mCoffee.getPrice());

    }

    private  void showCoffee(Coffee coffee) {

        System.out.println("ingredients : " + coffee.getIngredients());
        System.out.println("price : " + coffee.getPrice());
        System.out.println("==============");
    }
}
