package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    /*
     * Notice that this field name "welcomeText"
     * is identical with its corresponding id value in the FXML file:
     * <Label fx:id="welcomeText"/>
     */
    @FXML
    private Label welcomeText;

    /*
     * Adding our custom field for the text field in the view:
     * following the same pattern of IntelliJ
     * 
     * Our FXML file "hello-view.fxml" has: <TextField fx:id="txtCourse"/>
     * 
     * this private field "txtCourse" will create a reference to our FXML object:
     * the text field element "<TextField /> with the id of "txtCourse"
     * 
     * Notice that we are using "TextField" and "Label", so we have to import them
     * from "javafx.scene.control"
     */
    @FXML
    private TextField txtCourse;

    // Same with lblCourse:
    @FXML
    private Label lblCourse;

    // "onHelloButtonClick" is the original template code that we can comment/omit
    // if you like:
    @FXML
    protected void onHelloButtonClick() {
        // keep this
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    /*
     * Adding our custom method to control the text field in the view:
     * following the same pattern of IntelliJ
     */
    @FXML
    protected void OnCourseButtonClick() {
        // add our code:
        // testing:
        System.out.println("Button is clicked");

        // getting the user input
        String courseName = txtCourse.getText();

        // output the user's input into a label
        lblCourse.setText("Your course is " + courseName);

        // Or Just in one line:
        // lblCourse.setText("Your course is " + txtCourse.getText());
    }

}