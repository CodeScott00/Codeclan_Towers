import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        bedroom = new Bedroom(10,2,true);
        guest1 = new Guest("Tommy Shellby");
        guest2 = new Guest("Micheal Grey");
        guest3 = new Guest("Polly Grey");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void twinTrueDoubleFalse(){
        assertEquals(true, bedroom.isTwin());
    }

    @Test
    public void getGuestCollectionEmpty(){
        assertEquals(0, bedroom.getNumberOfGuestCollection());
    }

    @Test
    public void canAddGuestToGuestList(){
        bedroom.addGuestToGuestCollection(guest1);
        assertEquals(1, bedroom.getNumberOfGuestCollection());
    }

    @Test
    public void canRemoveGuestFromGuestList(){
        bedroom.addGuestToGuestCollection(guest3);
        bedroom.removeGuestFromGuestCollection();
        assertEquals(0, bedroom.getNumberOfGuestCollection());
    }
}
