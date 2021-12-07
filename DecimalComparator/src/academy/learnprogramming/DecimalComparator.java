package academy.learnprogramming;

import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        int firstNumberCasted = (int)(firstNumber * 1000);
        int secondNumberCasted = (int)(secondNumber * 1000);

        return firstNumberCasted == secondNumberCasted;
    }
}
