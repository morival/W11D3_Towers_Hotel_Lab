import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomCollection;
    private ArrayList<ConferenceRoom> conferenceRoomCollection;

    public Hotel() {
        this.bedroomCollection = new ArrayList<Bedroom>();
        this.conferenceRoomCollection = new ArrayList<ConferenceRoom>();
    }

    public int countBedrooms() {
        return this.bedroomCollection.size();
    }

//    private Room room;
//    public Guest guest;
//
//    public Hotel(Room room, Guest guest) {
//        this.room = room
//    }

}
