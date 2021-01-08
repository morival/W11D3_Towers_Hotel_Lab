import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Booking booking;

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, RoomType.SINGLE, 99.99);
        conferenceRoom = new ConferenceRoom("Presidential Suite", 100);
        booking = new Booking(1, bedroom);
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

    @Test
    public void ifHotelHasBookings() {
        assertEquals(0, hotel.countBookings());
    }

    @Test
    public void canBookRoom() {
        hotel.addBooking((booking));
        assertEquals(1, hotel.countBookings());
    }
}
