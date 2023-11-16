package front;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {

    @FXML
    private ImageView board_left;

    @FXML
    private ImageView board_right;

    @FXML
    private ImageView board_up;

    @FXML
    private ImageView image;

    @FXML
    private ImageView oneY;

    @FXML
    private ImageView tryc;
    @FXML
    private ImageView deck;
    @FXML
    private ImageView mainBoard;
    @FXML
    private Button welcomeText;

    DraggableMaker draggableMaker = new DraggableMaker();
    @FXML
    public void initialize() throws IOException {
//        String path = "file:///C:\\Users\\ariel\\IdeaProjects\\javafx-project\\src\\main\\resources\\front\\images\\9-black.png";
//        // Load the image from your project's resources
//        Image image1 = new Image(path);
//        //image.setImage(image1);
        draggableMaker.makeDraggable(image);
        draggableMaker.makeDraggable(oneY);
    }

    @FXML
    public void clickDeck(MouseEvent event) {
        putCard();
        System.out.println("You clicked me!");
    }
    public void putCard() {
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(tryc);
        tryc.setVisible(true);
        transition.setToX(188-tryc.getLayoutX());
        transition.setToY(479-tryc.getLayoutY());
        transition.play();
    }
}