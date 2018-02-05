package musta.belmo.designpatterns.factory;

public class CarnivoreCage implements Cage {
    @Override
    public Animal getAnimal() {
        return new Carnivore();
    }
}
