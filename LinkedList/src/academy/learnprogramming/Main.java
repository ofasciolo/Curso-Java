package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96);
	    Customer anotherCustomer = customer;
	    anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        System.out.println("Balance for another customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());

        ArrayList<Integer> myArray = new ArrayList<Integer>();

        myArray.add(1);
        myArray.add(5);
        myArray.add(3);

        for (int i = 0; i < myArray.size(); i++){
            System.out.println((i + 1) + ". " + myArray.get(i));
        }

        myArray.add(1,2);

        for (int i = 0; i < myArray.size(); i++){
            System.out.println((i + 1) + ". " + myArray.get(i));
        }
    }
}
