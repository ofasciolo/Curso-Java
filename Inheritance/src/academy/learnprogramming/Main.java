package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);
	    Dog dog = new Dog("Toto", 5, 5,2,4,1,10,"Short cotton");
        dog.eat();
        dog.walk();
        dog.run();

    }
}
