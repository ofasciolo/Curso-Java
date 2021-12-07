package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions  dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("B3-200","Asus", 4,6,"v2.44");

        PC thisPC = new PC(theCase, monitor,motherboard);

        thisPC.powerUp();

        /*Create a single room of a house using composition
        *Think about the things that should be included in the room
        *Maybe physical parts of the house but furniture as well
        *Add at least one method to access an object via getter and
        *then that objects public method as you saw in the previous video.
        *then add at least one method to hide the object e.g. not using a getter
        *but to access the object used in composition within the main class
        * like you saw in this video. */

        Room room = new Room(1,"pink",2,"green");
        House house = new House("Alabama", room);
        house.buildRoom();
    }
}
