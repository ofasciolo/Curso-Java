package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void modifyGroceryItem(String currentItem, String item){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position, item);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private int findItem(String itemToFind){
        /*boolean exist = groceryList.contains(itemToFind);
        int position = groceryList.indexOf(itemToFind);
        if(position >= 0){
            return groceryList.get(position);
        }

        return null;*/
        return groceryList.indexOf(itemToFind);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        return position >= 0;
    }
}
