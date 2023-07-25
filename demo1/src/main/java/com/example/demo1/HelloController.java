package com.example.demo1;
/*
The control for handling the events that we might have on any node in the view
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    // We have a label and a button
    /*
     * Notice that this field name "welcomeText"
     * is identical with its corresponding id value in the FXML file:
     * <Label fx:id="welcomeText"/> 
     * 
     * Also, we need to import the "Label" class from javafx.scene.control in order to use it:
     * import javafx.scene.control.Label;
     *
     * NOTE:
     * The @FXML annotation is used to tag nonpublic controller member fields
     * and handler methods for use by FXML markup.
     * So each declaration for "private" or "protected"
     * must be annotated @FXML for the injection to work.
     */
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        /*
    this method will modify the label "welcomeText" when it's clicked
    */
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}