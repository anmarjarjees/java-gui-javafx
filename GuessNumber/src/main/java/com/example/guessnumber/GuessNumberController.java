package com.example.guessnumber;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random; // Random Class for random number

public class GuessNumberController {
    /*
     * Adding a label to reference the .fxml document,
     * so we add the annotation @FXML
     * 
     * Notice that this field name "lblResult"
     * is identical with its corresponding id value in the FXML file:
     * <Label fx:id="lblResult"/>
     */
    @FXML
    private Label lblResult;

    /*
     * Adding a text field to reference the .fxml document
     * This field is also named "txtUserNumber" as its corresponding one in the FXML
     * file:
     * <TextField fx:id="txtUserNumber"/>
     */
    @FXML
    private TextField txtUserNumber;

    /*
     * 1. Creating a random number between 1 and 10 using:
     * using the Random class to be imported from "java.util.Random"
     * import java.util.Random;
     * 
     * Notice that we added the code for generating the random number
     * outside button click event method as we don't want to generate a random
     * number
     * for every click! only when we start the application:
     */
    Random rand = new Random();

    // computer generates 1 and 10
    /*
     * Using .nextInt(1,11) to generate a random number between 1 as minimum and up
     * to 10 as maximum value
     * .nextInt(11) => will be between 0 and 10 (We don't want to include 0)
     */
    int randNumber = rand.nextInt(1, 11);

    @FXML
    protected void onHelloButtonClick() {
        // doing our code when the button is pressed:

        // Just for testing :-)
        System.out.println("The lucky number: " + randNumber);

        /*
         * Getting the user input from the text field with id value of "txtUserNumber":
         * and convert it to integer value.
         * To recap:
         * > Integer.parseInt(String)
         * > Float.parseFloat(String)
         * > Double.parseDouble(String)
         * > Long.parseLong(String)
         */
        int userNumber;
        String msg = "";

        /*
         * Notice we used try { } and catch { } to handle the parseInt() exception,
         * in case the user enters decimal value or text
         */
        try {
            userNumber = Integer.parseInt(txtUserNumber.getText());
            // check if the user input is valid first:
            if (userNumber >= 1 && userNumber <= 10) {
                if (userNumber == randNumber)
                    msg = "Good Job!, The lucky number is " + randNumber;
                    // lblResult.setText("Good Job, it's the lucky number");
                else if (userNumber > randNumber)
                    msg = "Your number is more than the lucky number";
                    // lblResult.setText("more than the lucky number");
                else
                    msg = "Your number is less than the lucky number";
                    // lblResult.setText("less than the lucky number");
            } else {
                msg = "Your input is invalid! It must be a number between 1 and 10";
            }
        } catch (NumberFormatException nfe) {
            msg = "Text or Decimal values are not accepted!";
        } finally {
            lblResult.setText(msg);
        }
    } // onHelloButtonClick()
} // class