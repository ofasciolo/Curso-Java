package academy.learnprogramming;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Tu vieja", 300, "tu_vieja@hotmail.com");
    }

    public VipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit,"peppa_pig@gmail.com");
    }

    public VipCustomer(String customerName, double creditLimit, String email){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
