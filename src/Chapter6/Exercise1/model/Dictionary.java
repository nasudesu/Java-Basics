package Chapter6.Exercise1.model;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> hashMap = new HashMap<>();

    public void addWord(String word, String value){
        hashMap.put(word, value);
    }

    public String searchForWord(String word){
        return hashMap.get(word);
    }
    public int getDictionarySize(){
        return hashMap.size();
    }

}
