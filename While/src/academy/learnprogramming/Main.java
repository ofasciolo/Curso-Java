package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************");

	    //This for is equal to the above while loop
        for(int i = 0; i < 5; i++){
            System.out.println("Count value is " + i);
        }

        System.out.println("****************");

        //Other while option
        count = 0;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************");

        count = 0;
        do{
            System.out.println("Count value is " + count);
            count ++;
        }while (count != 5);

        System.out.println("****************");

        /*Create a method called isEvenNumber that takes a parameter of type int
        *Its purpose is to determine if the argument passed to the method is
        *an even number or not
        *return true if is an even number, otherwise return false*/

        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
        }

        System.out.println("**************");

        /*Modify the while code above
        * Make it also record the total number of even numbers it has found
        * and break one 5 are found
        * and at the end, display the total number of even numbers found*/

        number = 4;
        finishNumber = 20;
        count = 0;
        while(number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            if(count != 5) {
                count ++;
                System.out.println("Even number " + number);
            }else{
                break;
            }
        }

        System.out.println("Total even numbers found = " + count);

    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
