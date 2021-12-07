package academy.learnprogramming;

public class Room {

    private int bed;
    private String chair;
    private int placard;
    private String walls;

    public Room(int bed, String chair, int placard, String walls) {
        this.bed = bed;
        this.chair = chair;
        this.placard = placard;
        this.walls = walls;
    }

    public void paintWalls(String colour){
        walls = colour;
        System.out.println("Now the walls are: " + colour);
        System.out.println("Matching chair...");
        chair = colour;
        System.out.println("Now the chair is: " + colour);
    }

}
