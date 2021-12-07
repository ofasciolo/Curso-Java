package academy.learnprogramming;

public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int count = getDigitCount(number);
        int reverse = reverse(number);
        int countReverse = getDigitCount(reverse);

        while(reverse != 0){
            int lastDigit = reverse % 10;
            reverse /= 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            if (count != countReverse && reverse == 0) {
                for (int i = getDigitCount(reverse(number)); i < getDigitCount(number); i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            int lastDigit = number % 10;
            reverse += lastDigit;
            number /= 10;
            reverse *= 10;
        }
        reverse /= 10;
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        int count = 0;
        if(number == 0){
            count ++;
        }

        while(number > 0){
            number /= 10;
            count ++;
        }

        return count;
    }

}
