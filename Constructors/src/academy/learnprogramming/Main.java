package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    /*Create a new class for a bank account
	    * create fields for the account number, balance, customer name, email and phone number
	    *
	    * Create getters and setters for each field
	    * Create two additional methods
	    * 1.    To allow the customer to deposit funds (this should increment the balance field)
	    * 2.    To allow the customer to withdraw funds (this should deduct from the balancce field
	    * but not allow the withdrawal to complete if their are insufficient funds.)
	    * You will want to create various code in the Main class (the one created by Intellij) to
	    * confirm your code is working
	    * Add some System.out.println's in the two methods above as well*/
		BankAccount myAccount = new BankAccount();

		myAccount.depositFunds(123);
		myAccount.withdrawFunds(4333);
		myAccount.withdrawFunds(12);

		BankAccount otherAccount = new BankAccount("Ornella", "ornella_java@gmail.com","1234567890");
		System.out.println(otherAccount.getAccountNumber() + " name " + otherAccount.getCustomerName());

    	/*Create a new class VipCustomer
    	* It should have 3 fields: name, credit limit, and email address.
    	* Create 3 constructors
    	* 1st constructor empty should call the constructor with 3 parameters with default values
    	* 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    	* 3rd constructor should save all fields.
    	* create getters only for the using code generation of Intellij as setters wont be needed
    	* test and confirm it works*/

    	VipCustomer vipCustomer = new VipCustomer();
		System.out.println("Name: " + vipCustomer.getCustomerName() + ", Credit limit: " + vipCustomer.getCreditLimit() + ", Email: " + vipCustomer.getEmail());

		VipCustomer secondVipCustomer = new VipCustomer("Anna", 3450);
		System.out.println("Name: " + secondVipCustomer.getCustomerName() + ", Credit limit: " + secondVipCustomer.getCreditLimit() + ", Email: " + secondVipCustomer.getEmail());

    	VipCustomer thirdVipCustomer = new VipCustomer("Ornella", 2, "quiero_dormir@yahoo.com");
		System.out.println("Name: " + thirdVipCustomer.getCustomerName() + ", Credit limit: " + thirdVipCustomer.getCreditLimit() + ", Email: " + thirdVipCustomer.getEmail());
    }
}
