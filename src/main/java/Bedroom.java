import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> collectionOfGuests;
    private RoomType type;

    public Bedroom(int roomNumber, int capacity, RoomType type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
        this.type = type;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public RoomType getRoomType(){
        return type;
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
        } else {
            this.collectionOfGuests.clear();
        }
    }

    public void checkOut(Guest guest){
        this.collectionOfGuests.remove(guest);
    }

}
