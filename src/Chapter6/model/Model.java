package Chapter6.model;

import java.util.HashMap;

public class Model {

    private HashMap<String, String> hashMap = new HashMap<>();

    public void addWord(String word, String value){
        hashMap.put(word, value);
    }

    public String searchForWord(String word){
        return hashMap.get(word);
    }

    public static void main(String[] args) {
        Model model = new Model();

        model.addWord("Suomi", "Helsinki");
        System.out.println(model.searchForWord("Suomi"));
    }

}
