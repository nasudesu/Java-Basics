package Chapter7.Exercises3and4.entity;

import Chapter7.Exercises3and4.application.CCcontrol;
import Chapter7.Exercises3and4.dao.CurrencyDao;
import Chapter7.Exercises3and4.dao.TransactionDao;
import javafx.application.Application;
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
    int id = 0;

    public void init() {
        cCcontrol = new CCcontrol(this);
    }

    public void start(Stage stage) {
        cCcontrol.addCurrency();
        CurrencyDao currencyDao = new CurrencyDao();
        TransactionDao transactionDao = new TransactionDao();
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);

        Button convert = new Button("Convert");
        Button addCurrency = new Button("Add currency");
        TextField amountToConvert = new TextField("");
        TextField convertedAmount = new TextField("");

        convert.setOnAction(event -> {
            try {
                double value = Double.parseDouble(amountToConvert.getText());
                cCcontrol.setValue(value);
                double convertedValue = cCcontrol.convertValue();
                convertedAmount.setText(String.valueOf(convertedValue));
                Transaction transaction = new Transaction(id++, value);
                transactionDao.persist(transaction);
            } catch (Exception e) {
                amountToConvert.setText("Give a number");
                System.out.println("Give a number");
            }
        });

        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.setItems(currencyDao.getAllCurrency());
        choiceBox1.setOnAction(event -> {
            String selectedOption = choiceBox1.getValue();
            cCcontrol.setType1(selectedOption);
        });

        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.setItems(currencyDao.getAllCurrency());
        choiceBox2.setOnAction(event -> {
            String selectedOption = choiceBox2.getValue();
            cCcontrol.setType2(selectedOption);
        });

        addCurrency.setOnAction(event -> {
            Stage newStage = new Stage();
            GridPane newGridPane = new GridPane();
            newGridPane.setAlignment(Pos.CENTER);
            TextField currency = new TextField("");
            currency.setPromptText("Currency");
            TextField rate = new TextField("");
            rate.setPromptText("Rate");
            Button add = new Button("Add");
            newGridPane.add(currency, 0, 0);
            newGridPane.add(rate, 0, 1);
            newGridPane.add(add, 0, 2);
            add.setOnAction(event1 -> {
                try {
                    String currency1 = currency.getText();
                    double rate1 = Double.parseDouble(rate.getText());
                    currencyDao.update(new Currency(currency1, rate1));
                    cCcontrol.addCurrency();
                    choiceBox1.setItems(currencyDao.getAllCurrency());
                    choiceBox2.setItems(currencyDao.getAllCurrency());
                    newStage.close();
                } catch (Exception e) {
                    currency.setText("Give a currency");
                    rate.setText("Give a number");
                    System.out.println("Give a currency and a number");
                }
            });
            Scene view = new Scene(newGridPane, 250, 100);
            view.getStylesheets().add("CSS.css");
            newStage.setTitle("Add currency");
            newStage.setScene(view);
            newStage.show();
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

        gridPane.add(addCurrency, 1, 3);

        Scene view = new Scene(gridPane, 500, 200);
        view.getStylesheets().add("CSS.css");
        stage.setTitle("Currency convert");
        stage.setScene(view);
        stage.show();
    }
}
