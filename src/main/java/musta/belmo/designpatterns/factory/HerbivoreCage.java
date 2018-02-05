package musta.belmo.designpatterns.factory;

public class HerbivoreCage implements Cage {
    @Override
    public Animal getAnimal() {
        return new Herbivore();
    }
}
