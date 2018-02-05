package musta.belmo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Child implements Observable {
    private Listener<Child> listener;
    private List<Observer> observers;
    private boolean hungry = true;

    public void setHungry(boolean hungry) {
        this.hungry = hungry;

        if (hungry) {
            notifyObserver();
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public Child() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            System.out.print("Fed by : ");
            observer.update();

            if (listener != null)
                listener.onChange(this);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setListener(Listener<Child> listener) {
        this.listener = listener;
    }
}
