package academy.learnprogramming;

public class Printer {

    private int tonerLevel = 0;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int fillUpToner(int refill){

        if(refill < 0 || refill > 100){
            return -1;
        }

        int totalToner = tonerLevel + refill;
        if(totalToner > 100){
            return -1;
        }

        tonerLevel += refill;
        return tonerLevel;
    }

    public int printPage(int pagesPrinted) {
        if (duplex) {
            this.pagesPrinted += pagesPrinted / 2 + pagesPrinted % 2;
            System.out.println("Duplex Mode!!");
        } else {
            this.pagesPrinted += pagesPrinted;
        }
        return this.pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
