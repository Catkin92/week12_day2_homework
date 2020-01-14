package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor youngVisitor;
    Visitor shortVisitor;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(13, 2.1, 10.0);
        youngVisitor = new Visitor(9, 1.5, 10.0);
        shortVisitor = new Visitor(13, 1.3, 10.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollerCoaster() {
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void cannotRideRollerCoasterTooYoung() {
        assertFalse(rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void cannotRideRollerCoasterTooShort() {
        assertFalse(rollerCoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.1);
    }

    @Test
    public void canGetNormalPrice() {
        assertEquals(8.4, rollerCoaster.priceFor(youngVisitor), 0.1);
    }

    @Test
    public void canGetDoublePrice() {
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.1);
    }

}
