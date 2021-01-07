import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("Presidential Suite", 2);
        guest1 = new Guest("Mateusz");
        guest2 = new Guest("Michael");
        guest3 = new Guest("John");
    }

    @Test
    public void hasName() {
        assertEquals("Presidential Suite", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void hasNoGuestsInRoom() {
        assertEquals(0, conferenceRoom.countGuestsInRoom());
    }

    @Test
    public void canCheckIn() {
        conferenceRoom.checkIn(guest1);
        assertEquals(1, conferenceRoom.countGuestsInRoom());
    }

    @Test
    public void cannotCheckIn() {
        conferenceRoom.allowCheckIn(guest1);
        conferenceRoom.allowCheckIn(guest2);
        conferenceRoom.allowCheckIn(guest3);
        assertEquals(2, conferenceRoom.countGuestsInRoom());
    }

    @Test
    public void canCheckOut() {
        conferenceRoom.allowCheckIn(guest1);
        conferenceRoom.allowCheckIn(guest2);
        conferenceRoom.checkOut(guest1);
        assertEquals(1, conferenceRoom.countGuestsInRoom());
    }


}
