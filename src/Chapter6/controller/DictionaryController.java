package Chapter6.controller;


import Chapter6.model.Dictionary;
import Chapter6.view.DictionaryGUI;

public class DictionaryController {

    private DictionaryGUI dictionaryGUI;
    private Dictionary dictionary;

    public DictionaryController(DictionaryGUI dictionaryGUI) {
        this.dictionaryGUI = dictionaryGUI;
        this.dictionary = new Dictionary();
    }
    public int getDictionarySize(){
        return dictionary.getDictionarySize();
    }

    public void addWord(String word, String description){
        dictionary.addWord(word, description);
    }

    public String getDescription(String word){
        return dictionary.searchForWord(word);
    }

    public static void main(String[] args) {
        DictionaryGUI.launch(DictionaryGUI.class);
    }

}
