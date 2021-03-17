import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferanceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Meeting Room",12);
        guest1 = new Guest("David Brent");
        guest2 = new Guest("Tim Canterbury");
        guest3 = new Guest("Don Tinsley");
    }

    @Test
    public void hasName(){
        assertEquals("Meeting Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, conferenceRoom.getCapacity());
    }

    @Test
    public void getGuestCollectionEmpty(){
        assertEquals(0, conferenceRoom.getNumberOfGuestCollection());
    }
}
