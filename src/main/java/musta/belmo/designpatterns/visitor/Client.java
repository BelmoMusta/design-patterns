package musta.belmo.designpatterns.visitor;

public class Client implements Visitor {

    private void visitingDisplayMessage(Visitable visitable) {
        System.out.println("visiting " + visitable);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(LivingRoom livingRoom) {
        visitingDisplayMessage(livingRoom);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(Kitchen kitchen) {
        visitingDisplayMessage(kitchen);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(Bathroom bathroom) {
        visitingDisplayMessage(bathroom);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(Visitable anyOtherVisitable) {
        throw new UnsupportedOperationException("this is not required in this implementation");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit(House house) {
        visitingDisplayMessage(house);
    }
}
