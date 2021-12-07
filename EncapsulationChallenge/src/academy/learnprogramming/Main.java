package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        /*Create a class a demonstrate proper encapsulation techniques
        *the class will be called printer
        *It will simulate a real computer printer
        *It should have fields for the toner level, number of pages printed, and
        *also whether its a duplex printer (capable of printing both sides of the paper)
        *Add methods to fill up the toner (up to a maximum of 100%), another method to
        *simulate printing a page (which should increase the number of pages printed).
        * Decide on the scope, whether to use constructors and anything else you think is needed.*/

        Printer printer = new Printer(99, false);

        System.out.println("Initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer: " + printer.getPagesPrinted());
        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer: " + printer.getPagesPrinted());




    }
}
