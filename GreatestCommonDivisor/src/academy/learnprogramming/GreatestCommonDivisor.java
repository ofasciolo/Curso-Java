package academy.learnprogramming;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

       int divisorOne = 0;
       int divisorTwo = 0;
       int common = 0;
       while(divisorOne < first || divisorTwo < second){
           divisorOne++;
           divisorTwo++;

           if (first % divisorOne == 0 && second % divisorTwo == 0){
               common = divisorOne;
           }
       }

        return common;

    }
}
