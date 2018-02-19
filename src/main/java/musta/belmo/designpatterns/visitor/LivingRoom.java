package musta.belmo.designpatterns.visitor;

/**
 * Specific class for the living room as a visitable part of the house.
 */
public class LivingRoom implements Visitable {
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
        return "Living room";
    }
}
