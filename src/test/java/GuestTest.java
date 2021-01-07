import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp() {
        guest1 = new Guest("Mateusz");
        guest2 = new Guest("Michael");
    }

    @Test
    public void canGetGuestsName() {
        assertEquals("Mateusz", guest1.getGuestsName());
    }
}
