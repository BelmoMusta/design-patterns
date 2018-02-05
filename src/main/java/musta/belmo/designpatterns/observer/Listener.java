package musta.belmo.designpatterns.observer;

public interface Listener <T>{
    void onChange(T object);
}
