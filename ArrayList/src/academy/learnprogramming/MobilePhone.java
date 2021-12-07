package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    private void modifyContact(int position, Contact contact){
        contacts.set(position, contact);
        System.out.println("The contact was modified.");
    }

    public void modifyContact(String currentContactName, Contact contact){

        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getName().equals(currentContactName)){
                Contact currentContact = contacts.get(i);
                int position = findItem(currentContact);
                System.out.println(onFile(contact));
                if(onFile(contact)){
                    System.out.println("I am sorry, but the contact is already on the list.");
                }else if(position >= 0){
                    modifyContact(position, contact);
                }
            }
        }

    }

    private int findItem(Contact contact){
        return contacts.indexOf(contact);
    }

    public boolean onFile(Contact contact){
        int position = findItem(contact);
        return position >= 0;
    }

    public void removeContact(String contactname){
        for (int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getName().equals(contactname)){
                Contact contact = contacts.get(i);
                contacts.remove(contact);
                System.out.println("The contact was removed.");
            }
        }

    }

    public void printContacts(){
        if(contacts.size() == 0){
            System.out.println("There is no contact in the list.");
        }else{
            for (int i = 0; i < contacts.size(); i++){
                System.out.println((i + 1) + ". " + contacts.get(i).getName() + " -> " + contacts.get(i).getPhoneNumber());
            }
        }

    }
}
