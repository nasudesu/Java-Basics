package Chapter2.Exercises2;

import java.util.ArrayList;

public class GroceryListManager1 {
    private ArrayList<String> groceryList = new ArrayList<>();
    void addItem(String item){
        groceryList.add(item);
    }
    void removeItem(String item){
        for (int i = 0; i < groceryList.size(); i++) {
            if (groceryList.get(i).equalsIgnoreCase(item)){
                System.out.println("Removing "+groceryList.get(i)+" from the list...");
                groceryList.remove(i);
                break;
            }
        }
    }
    void displayList(){
        System.out.println("Grocery List:");
        int num = 1;
        for (String s : groceryList) {
            System.out.println(num+". "+s);
            num += 1;
        }
    }
    boolean checkItem(String name){
        boolean contains = false;
        for (int i = 0; i < groceryList.size(); i++) {
            if (groceryList.contains(name)){
                contains = true;
                break;
            }
        }
        return contains;
    }


    public static void main(String[] args) {
        GroceryListManager1 groceryListManager = new GroceryListManager1();

        groceryListManager.addItem("Apples");
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Bread");
        groceryListManager.displayList();

        System.out.println();
        System.out.println("Is 'Milk' in the grocery list? " + groceryListManager.checkItem("Milk"));
        System.out.println();

        groceryListManager.removeItem("Milk");
        System.out.println();
        groceryListManager.displayList();


    }
}
