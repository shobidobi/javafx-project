package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private ImageView image;

    @FXML
    private Button welcomeText;
    @FXML
    public void initialize() {
        // Load the image from your project's resources
        Image image1 = new Image(getClass().getResourceAsStream("..\\..\\..\\..\\java\\com\\example\\javafxproject\\images\\9-black.png"));

        // Set the image to the ImageView
        image.setImage(image1);
    }
}