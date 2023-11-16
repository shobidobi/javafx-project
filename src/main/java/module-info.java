module front.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens front to javafx.fxml;
    exports front;
}