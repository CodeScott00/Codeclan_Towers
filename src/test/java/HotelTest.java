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
    Guest guest1;

    @Before
    public void before(){
        hotel = new Hotel("Codeclan Towers");
        bedroom1 = new Bedroom(212,1,false);
        bedroom2 = new Bedroom(101,2,true);
        bedroom3 = new Bedroom(131,1,true);
        conferenceRoom1 = new ConferenceRoom("Meeting Room", 12);
        conferenceRoom2 = new ConferenceRoom("Bat Cave", 2);
        guest1 = new Guest("Bruce Wayne");
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

    @Test
    public void canAddBedroomToHotel(){
        hotel.addBedroomtoBedroomCollection(bedroom1);
        assertEquals(1, hotel.getBedroomCollectionSize());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(bedroom1, guest1);
        assertEquals(1, bedroom1.getNumberOfGuestCollection());
        assertEquals(1, hotel.getBedroomCollectionSize());
    }

    @Test
    public void canAddConferenceRoomToHotel(){
        hotel.addConferenceRoomToConferenceRoomCollection(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRoomCollection());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom2, guest1);
        assertEquals(1, conferenceRoom2.getNumberOfGuestCollection());
        assertEquals(1, hotel.getConferenceRoomCollection());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.checkInGuestToBedroom(bedroom2, guest1);
        hotel.checkOutGuestFromBedroom(bedroom2);
        assertEquals(0, bedroom2.getNumberOfGuestCollection());
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom2, guest1);
        hotel.checkOutGuestFromConferenceRoom(conferenceRoom2);
        assertEquals(0, conferenceRoom2.getNumberOfGuestCollection());
    }


}
