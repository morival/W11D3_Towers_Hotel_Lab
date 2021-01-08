import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private RoomType type;
    private double nightRate;
    private ArrayList<Guest> collectionOfGuests;

    public Bedroom(int roomNumber, int capacity, RoomType type, double nightRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.nightRate = nightRate;
        this.collectionOfGuests = new ArrayList<Guest>();

    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public RoomType getRoomType(){
        return this.type;
    }

    public double getNightRate() {
        return this.nightRate;
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
