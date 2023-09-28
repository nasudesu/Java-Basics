package Chapter6.Exercise1.view;

import Chapter6.Exercise1.controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class DictionaryGUI extends Application {

    private DictionaryController dictionaryController;

    private String description;

    @Override
    public void init() {
        this.dictionaryController = new DictionaryController(this);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane pane1 = new FlowPane();
        FlowPane pane2 = new FlowPane();
        FlowPane mainPane = new FlowPane();

        TextField text = new TextField("Give a word");
        TextField text2 = new TextField("Give a description");

        Button searchButton = new Button("Search");
        Button addWordButton = new Button("Add word");

        addWordButton.setOnAction(event -> {
            if (text.getText().isEmpty() || text2.getText().isEmpty()) {
                text2.setText("Give a word");
            } else {
                dictionaryController.addWord(text.getText(), text2.getText());
            }
        });
        searchButton.setOnAction(event -> {
            for (int i = 0; i < dictionaryController.getDictionarySize(); i++) {
                if (dictionaryController.getDescription(text.getText()) == null) {
                    text2.setText("Word not found");
                } else {
                    text2.setText(dictionaryController.getDescription(text.getText()));
                }
            }
        });

        pane1.getChildren().addAll(text, searchButton, addWordButton);
        pane2.getChildren().addAll(text2);
        mainPane.getChildren().addAll(pane1, pane2);


        Scene view = new Scene(mainPane, 300, 300);
        stage.setTitle("Dictionary");
        stage.setScene(view);
        stage.show();

    }
}
