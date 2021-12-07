package academy.learnprogramming;

public class House {

    private String address;
    private Room room;

    public House(String address, Room room) {
        this.address = address;
        this.room = room;
    }

    public void buildRoom(){
        room.paintWalls("red");
    }

}
