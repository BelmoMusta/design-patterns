package musta.belmo.designpatterns.visitor;

import java.util.Arrays;
import java.util.List;

public class House implements Visitable {
    /**
     * List of house parts.
     */
    private List<Visitable> houseParts = Arrays.asList(new LivingRoom(), new Kitchen(), new Bathroom());

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
        for (Visitable housePart : houseParts) {
            housePart.accept(visitor);
        }
    }

    /**
     * @return the name of this part.
     */

    @Override
    public String toString() {
        return "House";
    }
}
