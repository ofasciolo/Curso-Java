package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = readIntegers(5);

        int minimumNumber = findMin(array);
        System.out.println("This is my array: " + Arrays.toString(array));
        System.out.println("This is the minimum number: " + minimumNumber);
    }

    public static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfIntegers = new int[count];
        System.out.println("Enter " + count + " numbers");
        for(int i = 0; i < arrayOfIntegers.length; i++){
            arrayOfIntegers[i] = scanner.nextInt();
        }

        return arrayOfIntegers;
    }

    public static int findMin(int[] array){
        int minimumNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                minimumNumber = array[i];
            }
            if(array[i] < minimumNumber){
                minimumNumber = array[i];
            }
        }

        return minimumNumber;
    }




}
