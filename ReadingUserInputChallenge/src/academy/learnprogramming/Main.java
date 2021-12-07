package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int count = 1;
	    int sum = 0;
	    while(count <= 10){
            System.out.println("Enter number #" + count + ":");
	        boolean hasNextInt = scanner.hasNextInt();

	        if (hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //because if i didn't enter a number, it will show the error and eliminate the value from the scanner
	    }
        System.out.println("This is the total sum = " + sum);

	    scanner.close();
    }
}
