package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Orne", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        /*
        Create a method called calcFeetAndInchesToCentimeters
        It needs to have two parameters.
        feet is the first parameter, inches is the 2nd parameter

        You should validate that the first parameter feet is >=0
        You should validate that the 2nd parameter inches is >=0 and <=12
        return -1 from the method if either of the above is not true

        If the parameters ar valid, then calculate how many centimeters
        compromise the feet and the inches passed to this method and return
        the value.

        Create a 2nd method of the same name but with only one parameter
        inches is the parameter
        validate that its >=0
        return -1 if it is not true
        But if its valid, then calculate hoy many feet are in the inches
        and then here is the tricky part
        call the other overloaded method passing the correct feet and inches
        calculated so that it can calculate correctly.
        hints: Use double for your number datatypes is probably a good idea
        1 inch = 2.54cm and one foot = 12 inches
        use the link i give you to confirm your code is calculating correctly.
        Calling another overloaded method just requires you to use the
        right number of parameters.
        */

        System.out.println(calcFeetAndInchesToCentimeters(6,9));
        System.out.println(calcFeetAndInchesToCentimeters(100));

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <= 0 || !(inches >= 0 && inches <= 12)){
            return -1;
        }

        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double totalFeet = (int) inches / 12;
        double reminderInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + totalFeet + " feet and " + reminderInches + " inches" );
        return calcFeetAndInchesToCentimeters(totalFeet, reminderInches);
    }
}
