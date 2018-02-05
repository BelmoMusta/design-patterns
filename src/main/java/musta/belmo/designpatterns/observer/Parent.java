package musta.belmo.designpatterns.observer;

public abstract class Parent implements Observer {
    private Observable observable;


    public Parent(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(getMessage());
        unsubscribe();
    }

    void unsubscribe() {
        observable.removeObserver(this);
    }
    public abstract  String getMessage();
}
