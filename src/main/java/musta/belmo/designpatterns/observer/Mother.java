package musta.belmo.designpatterns.observer;

public class Mother extends Parent {


    public Mother(Observable observable) {
        super(observable);
    }
    @Override
    public void update() {
        System.out.println(getMessage());
        unsubscribe();
    }
    public String getMessage() {
        return "Mother";
    }
}
