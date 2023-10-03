package Chapter6.Exercise2.BetterVersion.view;

import Chapter6.Exercise2.BetterVersion.controller.CCcontrol;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CurrencyConverGUI extends Application {
    CCcontrol cCcontrol;

    public void init() {
        cCcontrol = new CCcontrol(this);
    }

    public void start(Stage stage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);

        Button convert = new Button("Convert");
        TextField amountToConvert = new TextField("");
        TextField convertedAmount = new TextField("");

        convert.setOnAction(event -> {
            try {
                double value = Double.parseDouble(amountToConvert.getText());
                cCcontrol.setValue(value);
                convertedAmount.setText(String.valueOf(cCcontrol.convertValue()));
            } catch (Exception e) {
                amountToConvert.setText("Give a number");
                System.out.println("Give a number");
            }
        });

        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.setItems(FXCollections.observableArrayList("EUR", "USD", "GBP", "JPY", "CNY", "CAD", "CHF", "AUD"));
        choiceBox1.setOnAction(event -> {
            String selectedOption = choiceBox1.getValue();
            cCcontrol.setType1(selectedOption);
        });

        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.setItems(FXCollections.observableArrayList("EUR", "USD", "GBP", "JPY", "CNY", "CAD", "CHF", "AUD"));
        choiceBox2.setOnAction(event -> {
            String selectedOption = choiceBox2.getValue();
            cCcontrol.setType2(selectedOption);
        });

        HBox hBox = new HBox();
        hBox.getChildren().add(choiceBox1);
        hBox.getChildren().add(choiceBox2);

        Label label1 = new Label("Convert amount");
        Label label2 = new Label("Converted amount");
        Label label3 = new Label("Chose currency from right from what u want to convert and from\n left to what u want to convert to enter values then press convert");


        gridPane.add(label1, 0, 0);
        gridPane.add(amountToConvert, 0, 1);

        GridPane.setHalignment(convert, HPos.CENTER);
        gridPane.add(convert, 1, 0);
        gridPane.add(hBox, 1, 1);

        gridPane.add(label2, 2, 0);
        gridPane.add(convertedAmount, 2, 1);

        GridPane.setHalignment(label3, HPos.CENTER);
        gridPane.add(label3, 0, 2, 3, 1);

        Scene view = new Scene(gridPane, 500, 200);
        view.getStylesheets().add("CSS.css");
        stage.setTitle("Currency convert");
        stage.setScene(view);
        stage.show();
    }
}
