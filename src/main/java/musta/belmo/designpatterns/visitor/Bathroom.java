package musta.belmo.designpatterns.visitor;

public class Bathroom implements Visitable {
    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Bathroom";
    }
}
