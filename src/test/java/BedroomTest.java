import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp() {
        bedroom = new Bedroom(1,2,RoomType.SINGLE);
        guest1 = new Guest("Mateusz");
        guest2 = new Guest("Michael");
        guest3 = new Guest("John");
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

    @Test
    public void hasNoGuestsInRoom() {
        assertEquals(0, bedroom.countGuestsInRoom());
    }

    @Test
    public void canCheckIn() {
        bedroom.checkIn(guest1);
        assertEquals(1, bedroom.countGuestsInRoom());
    }

    @Test
    public void cannotCheckIn() {
        bedroom.allowCheckIn(guest1);
        bedroom.allowCheckIn(guest2);
        bedroom.allowCheckIn(guest3);
        assertEquals(0, bedroom.countGuestsInRoom());
    }

    @Test
    public void canCheckOut() {
        bedroom.allowCheckIn(guest1);
        bedroom.allowCheckIn(guest2);
        bedroom.checkOut(guest1);
        assertEquals(1, bedroom.countGuestsInRoom());
    }
}
