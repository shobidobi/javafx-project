module com.example.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens front to javafx.fxml;
    exports front;
}