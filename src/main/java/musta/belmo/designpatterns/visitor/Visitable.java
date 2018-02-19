package musta.belmo.designpatterns.visitor;

/**
 * Interface for the visitable parts of a house.
 */
public interface Visitable {
    /**
     * A method to accept a visitor coming to visit this part.
     *
     * @param visitor the coming visitor.
     */
    void accept(Visitor visitor);
}
