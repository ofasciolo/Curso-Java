package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int numberQuantity = 0;
	    for(int i = 1; i<= 1000; i++){
	        if(i % 3 == 0 && i % 5 == 0){
	            count += i;
	            numberQuantity ++;
                System.out.println("This is the number = " + i);
                if(numberQuantity == 5){
                    System.out.println("Exiting the loop");
                    break;
                }
	        }
        }
        System.out.println("This is the total sum = " + count);
    }
}
