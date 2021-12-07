package academy.learnprogramming;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        int sumOfNumbers = firstNumber + secondNumber;

        return sumOfNumbers == thirdNumber;
    }
}
