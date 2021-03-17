import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guestCollection;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestCollection = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuestCollection() {
        return guestCollection.size();
    }

    public void addGuestToGuestCollection(Guest guest) {
        if(this.capacity >= getNumberOfGuestCollection() + 1){
            this.guestCollection.add(guest);
        }
    }


    public void removeGuestFromGuestCollection() {
        this.guestCollection.remove(0);
    }
}
