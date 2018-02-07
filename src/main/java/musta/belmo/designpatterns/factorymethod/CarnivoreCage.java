package musta.belmo.designpatterns.factorymethod;

public class CarnivoreCage implements Cage {
    @Override
    public Animal getAnimal() {
        return new Carnivore();
    }
}
