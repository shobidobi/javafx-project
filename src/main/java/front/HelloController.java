package front;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HelloController {

    @FXML
    private ImageView image;

    @FXML
    private Button welcomeText;
    @FXML
    public void initialize() throws IOException {
        String path = "file:///C:\\Users\\ariel\\IdeaProjects\\javafx-project\\src\\main\\java\\front\\images\\9-black.png";
        // Load the image from your project's resources
        Image image1 = new Image(path);

        // Set the image to the ImageView
        image.setImage(image1);
    }
}