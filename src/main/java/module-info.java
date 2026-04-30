module com.example.carbook {
    // Java FX modules
    requires javafx.controls;
    requires javafx.fxml;

    // other modules
    opens com.example.carbook to javafx.fxml;
    exports com.example.carbook;
}