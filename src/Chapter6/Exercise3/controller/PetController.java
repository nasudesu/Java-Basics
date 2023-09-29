package Chapter6.Exercise3.controller;

import Chapter6.Exercise3.model.Pet;
import Chapter6.Exercise3.view.PetGUI;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import static javafx.application.Application.launch;

public class PetController extends Thread {
    Pet pet;
    PetGUI petGUI;

    public PetController(PetGUI petGUI) {
        this.petGUI = petGUI;
        this.pet = new Pet(0, 0);
    }
    public Image getPet() {
        return pet.getJavaMascot();
    }

    public void setPetLocation(double x, double y) {
        pet.setLocationX(x);
        pet.setLocationY(y);
    }
    public double getPetLocationX() {
        return pet.getLocationX();
    }

    public void start(GraphicsContext gc) throws InterruptedException {
        gc.drawImage(pet.getJavaMascot(), pet.getLocationX(), pet.getLocationY(), 40, 60);
    }

    public double getPetLocationY() {
        return pet.getLocationY();
    }

    public static void main(String[] args) {
        PetGUI.launch(PetGUI.class);
    }

}
