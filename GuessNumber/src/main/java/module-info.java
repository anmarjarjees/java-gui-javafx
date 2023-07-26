module com.example.guessnumber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.guessnumber to javafx.fxml;
    exports com.example.guessnumber;
}