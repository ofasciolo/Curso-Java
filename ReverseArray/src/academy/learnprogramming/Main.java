package academy.learnprogramming;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1,2,3,4,5};
        System.out.println("This is my array: " + Arrays.toString(array));
	    reverse(array);
        System.out.println("This is my array reversed: " + Arrays.toString(array));

        List<String> myNewArray;
    }

    public static void reverse(int[] array){
        int length = array.length -1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
             int temp = array[i];
             array[i] = array[length - i];
             array[length - i] = temp;

        }
    }
}
