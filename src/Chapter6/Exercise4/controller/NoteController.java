package Chapter6.Exercise4.controller;

import Chapter6.Exercise4.model.Notebook;
import Chapter6.Exercise4.view.NoteGUI;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class NoteController {
    private Notebook notebook;
    @FXML
    private Button button;
    @FXML
    private Label noteTitle;
    @FXML
    private Label noteContent;
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    public void initialize() {
        button.setOnAction(event -> {
            notebook = new Notebook();
            notebook.addNote(
                    textField.getText(),
                    textArea.getText()
            );
            noteTitle.setText(notebook.getNoteByTitle(textField.getText()).getTitle());
            noteContent.setText(notebook.getNoteByTitle(textField.getText()).getContent());
        });
    }

    public static void main(String[] args) {
        NoteGUI.launch(NoteGUI.class);
    }

}
