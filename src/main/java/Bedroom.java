import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private boolean twin;
    private ArrayList<Guest> guestCollection;


    public Bedroom(int roomNumber, int capacity, boolean twin) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.twin = twin;
        this.guestCollection = new ArrayList<Guest>();

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isTwin() {
        return twin;
    }

    public int getNumberOfGuestCollection() {
        return guestCollection.size();
    }
}
