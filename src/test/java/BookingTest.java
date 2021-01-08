import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom1;
//    private Bedroom bedroom2;
    private Booking booking;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, 2, RoomType.SINGLE, 99.99);
//        bedroom2 = new Bedroom(2, 2, RoomType.SINGLE);
        booking = new Booking(1, bedroom1);
    }

    @Test
    public void hasNightsBooked() {
        assertEquals(1, booking.getNightsBooked());
    }

    @Test
    public void hasBedroomBooked() {
        assertEquals(bedroom1, booking.getBedroomBooked());
    }
}