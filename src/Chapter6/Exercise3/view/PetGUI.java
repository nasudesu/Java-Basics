package Chapter6.Exercise3.view;

import Chapter6.Exercise3.controller.PetController;
import javafx.application.Application;
import javafx.stage.Stage;

public class PetGUI extends Application {
    PetController petController;

    public void init() {
        petController = new PetController(this);
    }

    public void start(Stage stage) {
        System.out.println("PetGUI started");
    }

}
