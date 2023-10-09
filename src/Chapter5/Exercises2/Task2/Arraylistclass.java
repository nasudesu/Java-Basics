package Chapter5.Exercises2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Arraylistclass {
    List<String> list;
    Arraylistclass(){
        this.list = new ArrayList<>();
    }
    public synchronized void addItem(String item){
        list.add(item);
    }
    public int getListSize(){
        return list.size();
    }
    public synchronized void removeItem(String item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(item)){
                list.remove(i);
                break;
            }
        }
    }
}
