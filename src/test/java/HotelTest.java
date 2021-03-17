import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    @Before
    public void before(){
        hotel = new Hotel("Codeclan Towers");
        bedroom1 = new Bedroom(212,1,false);
        bedroom2 = new Bedroom(101,2,true);
        bedroom3 = new Bedroom(131,1,true);
        conferenceRoom1 = new ConferenceRoom("Meeting Room", 12);
        conferenceRoom2 = new ConferenceRoom("Bat Cave", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Codeclan Towers", hotel.getName());
    }

    @Test
    public void checkBedroomCollectionSize(){
        assertEquals(0, hotel.getBedroomCollectionSize());
    }

    @Test
    public void checkConferenceRoomCollectionSize(){
        assertEquals(0, hotel.getConferenceRoomCollection());
    }


}
