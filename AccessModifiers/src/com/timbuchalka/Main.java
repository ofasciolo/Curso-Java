package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Account ornesAccount = new Account("Orne");
	    ornesAccount.deposit(1000);
	    ornesAccount.withdraw(500);
	    ornesAccount.withdraw(-200);
	    ornesAccount.deposit(-20);
	    ornesAccount.calculateBalance();

        System.out.println("Balance on account is " + ornesAccount.getBalance());
    	ornesAccount.calculateBalance();
    }
}
