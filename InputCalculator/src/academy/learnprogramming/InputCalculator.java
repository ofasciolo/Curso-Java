package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;
        int count = 0;

        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                count ++;
            }else{
                break;
            }
            scanner.nextLine();
        }
        average = Math.round((double) sum / (double) count);

        System.out.println("SUM = " + sum + " AVG = " + (int)average);

        scanner.close();
    }
}
