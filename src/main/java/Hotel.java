import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroomCollection;
    private ArrayList<ConferenceRoom> conferenceRoomCollection;

    public Hotel(String name) {
        this.name = name;
        this.bedroomCollection = new ArrayList<Bedroom>();
        this.conferenceRoomCollection = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return name;
    }

    public int getBedroomCollectionSize() {
        return bedroomCollection.size();
    }

    public int getConferenceRoomCollection() {
        return conferenceRoomCollection.size();
    }

    public void addBedroomtoBedroomCollection(Bedroom bedroom) {
        this.bedroomCollection.add(bedroom);
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        this.addBedroomtoBedroomCollection(bedroom);
        bedroom.addGuestToGuestCollection(guest);
    }

    public void addConferenceRoomToConferenceRoomCollection(ConferenceRoom conferenceRoom) {
        this.conferenceRoomCollection.add(conferenceRoom);
    }

    public void checkInGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        addConferenceRoomToConferenceRoomCollection(conferenceRoom);
        conferenceRoom.addGuestToGuestCollection(guest);
    }

    public void checkOutGuestFromBedroom(Bedroom bedroom) {
        bedroom.removeGuestFromGuestCollection();
    }

    public void checkOutGuestFromConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuestFromGuestCollection();
    }

}
