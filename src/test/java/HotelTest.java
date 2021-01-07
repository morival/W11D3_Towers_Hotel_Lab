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
        bedroom = new Bedroom();
        conferenceRoom = new ConferenceRoom();

    }

    @Test
    public void ifHotelHasNoBedrooms() {
        assertEquals(0, hotel.countBedrooms());
    }

    @Test

}
