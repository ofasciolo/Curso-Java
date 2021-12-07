package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int sumOfDigits = 0;
        do{
            int lastDigit = number % 10;
            int reminderDigits = number / 10;
            sumOfDigits += lastDigit;
            number = reminderDigits;
        }while(number >= 1);

        return sumOfDigits;
    }
}
