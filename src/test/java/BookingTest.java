import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;
    Booking booking;

    @Before
    public void before(){
        bedroom1 = new Bedroom(212, 2, true);
        booking = new Booking(bedroom1, 3);
    }

    @Test
    public void hasBedroom(){
        assertEquals(true, booking.getBedroomAdded());
    }

    @Test
    public void hasNoNights(){
        assertEquals(3, booking.getNights());
    }
}
