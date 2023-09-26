package Chapter2.Exercises2;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingList {
    private ArrayList<String> shoppingList;
    ShoppingList(){
        this.shoppingList = new ArrayList<>();
    }
    void addItem(String item){
        shoppingList.add(item);
    }
    void removeItem(String item){
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equalsIgnoreCase(item)){
                shoppingList.remove(i);
                break;
            }
        }
    }
    void displayList(){
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }
}
