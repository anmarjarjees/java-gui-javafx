module com.example.javaterms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javaterms to javafx.fxml;
    exports com.example.javaterms;
}