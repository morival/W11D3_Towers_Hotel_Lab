import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void setUp() {
        bedroom = new Bedroom(1,2,RoomType.SINGLE);

    }

    @Test
    public void hasNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
}
