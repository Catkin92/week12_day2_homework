package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor youngVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(23, 1.4, 16.0);
        youngVisitor = new Visitor(11, 1.1, 15.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.5, dodgems.defaultPrice(), 0.1);
    }

    @Test
    public void canGetNormalPrice() {
        assertEquals(4.5, dodgems.priceFor(visitor), 0.1);
    }

    @Test
    public void canGetDiscountPrice() {
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.01);
    }
}
