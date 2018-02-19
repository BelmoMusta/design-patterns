package musta.belmo.designpatterns.visitor;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void testVisitor() {
        Visitable house = new House();
        house.accept(new Client());
    }
}
