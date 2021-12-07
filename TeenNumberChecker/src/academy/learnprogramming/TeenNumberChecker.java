package academy.learnprogramming;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){

        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);

    }

    public static boolean isTeen(int number){
        return number >= 13 && number <= 19;
    }

}
