module com.ekbal {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ekbal to javafx.fxml;
    exports com.ekbal;
}
