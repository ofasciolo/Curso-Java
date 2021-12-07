package academy.learnprogramming;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){
        if(!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree)){
            return false;
        }

        int lastDigitOne = numberOne % 10;
        int lastDigitTwo = numberTwo % 10;
        int lastDigitThree = numberThree % 10;

        return lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
