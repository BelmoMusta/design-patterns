package musta.belmo.designpatterns.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactoryMethodTest {
    @Test
    public void testFactory() {
        Cage herbivoreCage = new HerbivoreCage();
        Animal animal = herbivoreCage.getAnimal();
        String name = animal.showName();
        assertEquals("Herbivore", name);
    }

    @Test
    public void testFactoryFails() {
        Cage carnivorCage = new CarnivoreCage();
        Animal animal = carnivorCage.getAnimal();
        String name = animal.showName();
        assertNotEquals("Herbivore", name);
    }
}
