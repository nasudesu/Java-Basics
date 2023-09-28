package Chapter6.Exercise3.controller;

import Chapter6.Exercise3.model.Pet;
import Chapter6.Exercise3.view.PetGUI;

import static javafx.application.Application.launch;

public class PetController {
    Pet pet;
    PetGUI petGUI;

    public PetController(PetGUI petGUI) {
        this.petGUI = petGUI;
        this.pet = new Pet(0, 0);
    }


    public static void main(String[] args) {
        PetGUI.launch(PetGUI.class);
    }

}
