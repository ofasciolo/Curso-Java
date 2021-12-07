package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximumNumber = 0;
        int minimumNumber = 0;
        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();
                if(number > maximumNumber){
                    maximumNumber = number;
                }else if((number < maximumNumber && minimumNumber == 0) || number < minimumNumber){
                    minimumNumber = number;
                }
            }else{
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("This is the maximum number: " + maximumNumber);
        System.out.println("This is the minimum number: " + minimumNumber);

        scanner.close();
    }
}
