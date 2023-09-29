package Chapter6.Exercise3.view;

import Chapter6.Exercise3.controller.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PetGUI extends Application {
    PetController petController;

    public void init() {
        petController = new PetController(this);
    }

    public void start(Stage stage) {

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseMoved(event -> {
            gc.clearRect(0, 0, 500, 500);
            petController.setPetLocation(event.getX(), event.getY());
            
            gc.drawImage(petController.getPet(), event.getX(), event.getY(), 40, 60);
            double x = event.getX();
            double y = event.getY();
            System.out.println("Mouse moved to (" + x + ", " + y + ")");
        });


        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Canvas Demo");
        stage.setScene(scene);
        stage.show();
    }

}
