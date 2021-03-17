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
}
