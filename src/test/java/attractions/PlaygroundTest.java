package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor olderVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(8, 100.00, 3.50);
        olderVisitor = new Visitor(16, 150.00, 4.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canVisitPlayground() {
        playground.visit(visitor);
        assertEquals(1, playground.getVisitCount());
    }

    @Test
    public void cannotVisitPlayground() {
        playground.visit(olderVisitor);
        assertEquals(0, playground.getVisitCount());
    }
}
