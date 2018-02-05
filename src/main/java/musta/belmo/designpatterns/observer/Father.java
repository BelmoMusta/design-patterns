package musta.belmo.designpatterns.observer;

public class Father extends Parent {


    public Father(Observable observable) {
        super(observable);
    }

    @Override
    public void update() {
        System.out.println(getMessage());
        unsubscribe();
    }

    public String getMessage() {
        return "Father";
    }
}
