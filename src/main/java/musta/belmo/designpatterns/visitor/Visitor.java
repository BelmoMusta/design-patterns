package musta.belmo.designpatterns.visitor;

/**
 * The visitor interface
 */
public interface Visitor {
    /**
     * Method to visit the house
     *
     * @param house the house to be visited
     */
    void visit(House house);

    /**
     * Method to visit the living room
     *
     * @param livingRoom the living room to be visited
     */
    void visit(LivingRoom livingRoom);

    /**
     * Method to visit the kitchen
     *
     * @param kitchen the kitchen to be visited
     */
    void visit(Kitchen kitchen);

    /**
     * Method to visit the bathroom
     *
     * @param bathroom the bathroom to be visited
     */
    void visit(Bathroom bathroom);

    /**
     * Method to visit any other part of a given house e.g a back yard, (SOLID conventions)
     *
     * @param anyOtherVisitable the kitchen to be visited
     */
    void visit(Visitable anyOtherVisitable);
}
