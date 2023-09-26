package Chapter2.Exercises2;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager2 {
    private HashMap<String, Double> groceryList = new HashMap<String, Double>();
    private HashMap<String, String> category_list = new HashMap<String, String>();
    private HashMap<String, Integer> quantity_list = new HashMap<String, Integer>();
    private ShoppingList Backyard_BBQ = new ShoppingList();
    private ShoppingList Weekend_Camping = new ShoppingList();
    void addToBackyard_BBQ(String item){
        Backyard_BBQ.addItem(item);
    }
    void addToWeekend_Camping(String item){
        Weekend_Camping.addItem(item);
    }
    void displayBackyard_BBQ(){
        Backyard_BBQ.displayList();
    }
    void displayWeekend_Camping(){
        Weekend_Camping.displayList();
    }
    void addItem(String name,double cost){
        groceryList.put(name,cost);
    }
    void calculateTotalCost(){
        double cost = 0;
        for (String key : groceryList.keySet()){
            cost += groceryList.get(key);
        }
        System.out.println("Total cost of the list: "+cost);
    }
    void addItemWithCategory(String item, String category){
        category_list.put(item,category);
    }
    void displayByCategory(String targetCategory){
        for (Map.Entry<String, String> entry : category_list.entrySet()){
            String item = entry.getKey();
            String category = entry.getValue();
            if (category.equals(targetCategory)){
                System.out.println(targetCategory+": "+item);
            }

        }
    }
    void addItemWithQuantity(String item, int quantity){
        quantity_list.put(item,quantity);
    }
    void updateQuantity(String item, int newQuantity){
        quantity_list.replace(item,newQuantity);
    }
    void displayAvailableItems(){
        for (Map.Entry<String, Integer> entry : quantity_list.entrySet()){
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0){
                System.out.println(item+": "+quantity);
            }
        }
    }
    public static void main(String[] args) {
        GroceryListManager2 groceryListManager2 = new GroceryListManager2();

        //Task2
        //groceryListManager2.addItem("Apples",0.5);
        //groceryListManager2.addItem("Milk",1.5);
        //groceryListManager2.addItem("Bread",2.5);
        //groceryListManager2.calculateTotalCost();

        //Task3
        //groceryListManager2.addItemWithCategory("Apple","Fruits");
        //groceryListManager2.addItemWithCategory("Milk","Dairy");
        //groceryListManager2.addItemWithCategory("Bread","Bakery");
        //groceryListManager2.displayByCategory("Fruits");

        //Task4
        //groceryListManager2.addItemWithQuantity("Apple",3);
        //groceryListManager2.addItemWithQuantity("Milk",2);
        //groceryListManager2.addItemWithQuantity("Bread",5);
        //groceryListManager2.displayAvailableItems();
        //System.out.println();
        //groceryListManager2.updateQuantity("Apple",1);
        //groceryListManager2.displayAvailableItems();
        //System.out.println();
        //groceryListManager2.updateQuantity("Apple",0);
        //groceryListManager2.displayAvailableItems();
        //System.out.println();

        //Task5
        //groceryListManager2.addToBackyard_BBQ("Nakki");
        //groceryListManager2.addToBackyard_BBQ("Makkara");
        //groceryListManager2.addToBackyard_BBQ("Halloum");
        //groceryListManager2.displayBackyard_BBQ();
        //System.out.println();
        //groceryListManager2.addToWeekend_Camping("Nakki");
        //groceryListManager2.addToWeekend_Camping("Makkara");
        //groceryListManager2.addToWeekend_Camping("Halloum");
        //groceryListManager2.displayWeekend_Camping();
    }
}
