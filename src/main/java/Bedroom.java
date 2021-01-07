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
}
