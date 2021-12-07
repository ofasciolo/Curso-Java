package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items){
        for(int i: items){
            System.out.println(i * 2);
        }
    }
}
