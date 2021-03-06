package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor olderVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(8, 1.0, 3.5);
        olderVisitor = new Visitor(16, 1.5, 4.0);
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
        assertTrue(playground.isAllowedTo(visitor));
    }

    @Test
    public void cannotVisitPlayground() {
        assertFalse(playground.isAllowedTo(olderVisitor));
    }
}
