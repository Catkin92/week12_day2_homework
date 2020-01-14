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
        visitor = new Visitor(13, 1.5, 5.0);
        youngVisitor = new Visitor(9, 1.5, 5.0);
        shortVisitor = new Visitor(13, 1.3, 5.0);
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
}
