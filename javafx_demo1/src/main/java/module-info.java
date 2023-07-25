module com.introduction {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.introduction to javafx.fxml;
    exports com.introduction;
}
