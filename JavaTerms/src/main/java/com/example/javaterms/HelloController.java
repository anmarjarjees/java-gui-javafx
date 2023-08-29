package com.example.javaterms;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ToggleGroup terms;

    @FXML
    private RadioButton jdk;

    @FXML
    private RadioButton jre;

    @FXML
    private RadioButton jvm;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        RadioButton obj = (RadioButton) terms.getSelectedToggle();
        // testing:
        System.out.println(obj);
        // RadioButton@2f53759f[styleClass=radio-button]'JDK'

        // testing:
        System.out.println(obj.getClass());
        // class javafx.scene.control.RadioButton

        // testing:
        System.out.println(obj.getText());
        // JDK

        String term = obj.getText();
        // testing:
        System.out.println("Selected Term: " + term);

        /*
         * Using two different ways to get the selected radio button:
         */

        if (term.equals("JDK")) {
            System.out.println("JDK: Java Development Kit");
        } else if (term.equals("JRE")) {
            System.out.println("JRE: Java Runtime Environment");
        } else {
            System.out.println("JVM: Java Virtual Machine");
        }

        // OR:
        if (jdk.isSelected()) {
            System.out.println("JDK (Java Development Kit)");
        } else if (jre.isSelected()) {
            System.out.println("JRE (Java Runtime Environment)");
        } else if (jvm.isSelected()) {
            System.out.println("JVM (Java Virtual Machine)");
        }
    }
}