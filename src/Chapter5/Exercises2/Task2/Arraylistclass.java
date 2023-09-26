package Chapter5.Exercises2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Arraylistclass {
    List<String> list;
    Arraylistclass(){
        this.list = new ArrayList<>();
    }
    public void addItem(String item){
        list.add(item);
    }
    public int getListSize(){
        return list.size();
    }
}
