import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, RoomType.SINGLE);
        conferenceRoom = new ConferenceRoom();

    }

    @Test
    public void ifHotelHasNoBedrooms() {
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void ifHotelHasNoConferenceRooms() {
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canAddBedrooms() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void canAddConferenceRooms() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.countConferenceRooms());
    }
}
