package com.timbuchalka;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest("1st Instance");
        System.out.println(staticTest.getName() + " is instance number " + staticTest.getNumInstances());

        StaticTest staticTest2 = new StaticTest("2nd Instance");
        System.out.println(staticTest2.getName() + " is instance number " + staticTest2.getNumInstances());

        StaticTest staticTest3 = new StaticTest("2nd Instance");
        System.out.println(staticTest3.getName() + " is instance number " + staticTest3.getNumInstances());

        int answer = multiplier(6);
        System.out.println("The answer is: " + answer);
        System.out.println("Multiplier is: " + multiplier);
    }

    public static int multiplier(int number){
        return number * multiplier;
    }
}
