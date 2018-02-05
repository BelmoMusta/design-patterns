package musta.belmo.designpatterns.observer;

public interface Observable {

    void addObserver(Observer o);

    void notifyObserver();

    void removeObserver(Observer o);
}
