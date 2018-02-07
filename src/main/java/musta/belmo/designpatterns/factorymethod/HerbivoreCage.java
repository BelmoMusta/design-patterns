package musta.belmo.designpatterns.factorymethod;

public class HerbivoreCage implements Cage {
    @Override
    public Animal getAnimal() {
        return new Herbivore();
    }
}
