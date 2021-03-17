import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void canAddGuestsToConferenceRoom(){
        conferenceRoom.addGuestToGuestCollection(guest3);
        conferenceRoom.addGuestToGuestCollection(guest2);
        assertEquals(2, conferenceRoom.getNumberOfGuestCollection());
    }

    @Test
    public void canRemoveGuestFromGuestCollection(){
        conferenceRoom.addGuestToGuestCollection(guest1);
        conferenceRoom.removeGuestFromGuestCollection();
        assertEquals(0, conferenceRoom.getNumberOfGuestCollection());
    }
}
