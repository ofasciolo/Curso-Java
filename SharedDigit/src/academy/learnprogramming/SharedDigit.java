package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if(numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99){
            return false;
        }

        while(numberOne > 0){
            int lastDigit = numberOne % 10;
            int reminderNumber = numberTwo;
            while(reminderNumber > 0){
                int lastDigitTwo = reminderNumber % 10;
                if(lastDigit == lastDigitTwo){
                    return true;
                }
                reminderNumber /= 10;
            }
            numberOne /= 10;
        }

        return false;
    }
}
