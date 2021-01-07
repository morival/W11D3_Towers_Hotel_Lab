import java.util.ArrayList;

public class ConferenceRoom {
    private String roomName;
    private int capacity;
    private ArrayList<Guest> collectionOfGuests;

    public ConferenceRoom(String roomName, int capacity){
        this.roomName = roomName;
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
    }

    public String getRoomName(){
        return this.roomName;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public void checkIn(Guest guest){
        this.collectionOfGuests.add(guest);
    }

    public int countGuestsInRoom(){
        return this.collectionOfGuests.size();
    }

    public void allowCheckIn(Guest guest){
        if (countGuestsInRoom() < this.capacity){
            this.checkIn(guest);
        }
    }

    public void checkOut(Guest guest){
        this.collectionOfGuests.remove(guest);
    }

}
