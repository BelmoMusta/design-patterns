package musta.belmo.designpatterns.visitor;

public class Kitchen implements Visitable {
    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    /**
     * @return the name of this part.
     */
    @Override
    public String toString() {
        return "Kitchen";
    }
}
