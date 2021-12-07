package academy.learnprogramming;

public class LargestPrime {

    public static int getLargestPrime(int number){
        if (number < 0 || number == 0 || number == 1){
            return -1;
        }

        int largestPrimeNumber = 0;
        for (int i = 2; i <= number; i++ ){
            if(number % i == 0){
                number /= i;
                largestPrimeNumber = i;
                i--;
            }
        }

        return largestPrimeNumber;
    }
}
