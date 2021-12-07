package academy.learnprogramming;

class Burger{
    private String addition1;
    private double priceAddition1;
    private String addition2;
    private double pricAaddition2;
    private String addition3;
    private double priceAddition3;
    private String addition4;
    private double priceAddition4;

    private String name;
    private double price;
    private String breadRollType;
    private String meat;

    public Burger(String name, double price, String breadRollType, String meat) {
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public double getPriceAddition1() {
        return priceAddition1;
    }

    public void setPriceAddition1(double priceAddition1) {
        this.priceAddition1 = priceAddition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public double getPricAaddition2() {
        return pricAaddition2;
    }

    public void setPricAaddition2(double pricAaddition2) {
        this.pricAaddition2 = pricAaddition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public double getPriceAddition3() {
        return priceAddition3;
    }

    public void setPriceAddition3(double priceAddition3) {
        this.priceAddition3 = priceAddition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public double getPriceAddition4() {
        return priceAddition4;
    }

    public void setPriceAddition4(double priceAddition4) {
        this.priceAddition4 = priceAddition4;
    }

    public void addAdditions(String ingredient, double price){
        if(addition1 != null && addition2 != null && addition3 != null && addition4 != null){
            System.out.println("I am sorry, you can not add more ingredients. :(");
        }else{
            if (addition1 == null){
                this.price += price;
                addition1 = ingredient;
            }else if (addition2 == null){
                this.price += price;
                addition2 = ingredient;
            }else if (addition3 == null){
                this.price += price;
                addition3 = ingredient;
            }else if (addition4 == null){
                this.price += price;
                addition4 = ingredient;
            }
            System.out.println("You added: " + ingredient);
        }
    }
}


class HealthyBurger extends Burger{

    private String addition5;
    private double priceAddition5;
    private String addition6;
    private double priceAddition6;

    public HealthyBurger(double price, String meat) {
        super("Healthy burger",price, "Brown rye bread", meat);
    }

    @Override
    public void addAdditions(String ingredient, double price) {
        if(getAddition1() != null && getAddition2() != null && getAddition3() != null && getAddition4() != null && addition5 != null && addition6 != null){
            System.out.println("I am sorry, you can not add more ingredients. :(");
        }else{
            double priceBurger = getPrice();
            if(getAddition1() == null){
                setAddition1(ingredient);
                setPrice(priceBurger + price);
            }else if(getAddition2() == null){
                setAddition2(ingredient);
                setPrice(priceBurger + price);
            }else if(getAddition3() == null){
                setAddition3(ingredient);
                setPrice(priceBurger + price);
            }else if(getAddition4() == null){
                setAddition4(ingredient);
                setPrice(priceBurger + price);
            }else if(addition5 == null){
                addition5 = ingredient;
                setPrice(priceBurger + price);
            }else if(addition6 == null){
                addition6 = ingredient;
                setPrice(priceBurger + price);
            }

            System.out.println("You added: " + ingredient);
        }
    }
}

class DeluxeBurger extends Burger{

    public DeluxeBurger(double price, String breadRollType, String meat) {
        super("Deluxe burger",price, breadRollType, meat);
        setAddition1("Drink");
        setAddition2("Chips");
    }

    @Override
    public void addAdditions(String ingredient, double price) {
        System.out.println("I am sorry, but you can not add additions. You have a drink and chips already.");
    }
}



public class Main {

    public static void main(String[] args) {
        // The purpose of the application is to help a fictitious company called Bills Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Bill to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.
        // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
        // The basic hamburger should have the following items.
        // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger.
        // Each one of these items gets charged an additional price so you need some way to track how many items got added
        // and to calculate the final price (base burger with all the additions).
        // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price, can also include name of burger or you
        // can use a setter.
        // Also create two extra varieties of Hamburgers (subclasses) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
        // The healthy burger can have 6 items (Additions) in total.
        // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
        // not the base class (Hamburger), since the two additions are only appropriate for this new class
        // (in other words new burger type).
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
        //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
        // burger (base price + all additions)
        // For the two additional classes this may require you to be looking at the base class for pricing and then
        // adding totals to final price.

        Burger burger = new Burger("Basic", 3.56, "Sausage", "White");
        burger.addAdditions("Tomato", 0.27);
        burger.addAdditions("Lettuce", 1.27);
        burger.addAdditions("Onion", 0.75);
        burger.addAdditions("Mayo", 0.07);
        burger.addAdditions("Cheese", 0.35);
        System.out.println("The total price would be: " + burger.getPrice());

        HealthyBurger healthyBurger = new HealthyBurger(4.76, "Chicken");
        healthyBurger.addAdditions("Tomato", 0.27);
        healthyBurger.addAdditions("Lettuce", 1.27);
        healthyBurger.addAdditions("Onion", 0.75);
        healthyBurger.addAdditions("Mayo", 0.07);
        healthyBurger.addAdditions("Cheese", 0.35);
        System.out.println("The total price would be: " + healthyBurger.getPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger(10.23,"White","meat");
        deluxeBurger.addAdditions("Cheese", 0.35);
        System.out.println("The total price would be: " + deluxeBurger.getPrice());


    }
}
