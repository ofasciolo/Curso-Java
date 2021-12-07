package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static MobilePhone mobilePhone = new MobilePhone();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Create a program that implements a simple mobile phone with the following capabilities.
         *Able to store, modify, remove and query contact names.
         *You will want to create a separate class for Contacts (name and phone number).
         *Create a master class (MobilePhone) that holds the ArrayList of Contacts
         *The MobilePhone class has the functionality listed above.
         *Add a menu of options that are available.
         *Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
         *and search/find contact.
         *When adding or updating be sure to check if the contact already exists (use name)
         *Be sure not to expose the inner workings of the Arraylist to MobilePhone
         *e.g. no ints, no .get(i) etc
         *MobilePhone should do everything with Contact objects only.*/

        printListOfOptions();
        boolean quit = false;
        while(!quit){
            System.out.println("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    printListOfContacts();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    findContact();
                    break;
                case 5:
                    quit();
                    quit = true;
                    break;
            }
        }
    }

    public static void printListOfOptions(){
        System.out.println("\nPress ");
        System.out.println("\n0 - Print contact list.");
        System.out.println("\n1 - Add contact.");
        System.out.println("\n2 - Update contact.");
        System.out.println("\n3 - Remove contact");
        System.out.println("\n4 - Find contact");
        System.out.println("\n5 - Quit");
    }

    public static void printListOfContacts(){
        mobilePhone.printContacts();
    }

    public static void addContact(){
        System.out.println("Enter the contact's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact's phone number: ");
        int phoneNumber = scanner.nextInt();
        Contact newContact = new Contact(name, phoneNumber);
        mobilePhone.addContact(newContact);
    }

    public static void updateContact(){
        System.out.println("Enter the current contact's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the contact's name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter contact's phone number: ");
        int phoneNumber = scanner.nextInt();
        Contact newContact = new Contact(name2, phoneNumber);
        mobilePhone.modifyContact(name, newContact);
    }

    public static void removeContact(){
        System.out.println("Enter the contact's name: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void findContact(){
        System.out.println("Enter the current contact's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact's phone number: ");
        int phoneNumber = scanner.nextInt();
        Contact contact = new Contact(name, phoneNumber);
        if(mobilePhone.onFile(contact)){
            System.out.println("Contact found!");
        }else{
            System.out.println("I didn't find the contact.");
        }

    }

    public static void quit(){
        System.out.println("Goodbye.");
    }
}
