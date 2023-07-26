package com.example.guessnumber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GuessNumberApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuessNumberApp.class.getResource("hello-view.fxml"));
        // Modifying the width and height as needed:
        Scene scene = new Scene(fxmlLoader.load(), 370, 230);

        // Add/Modify the Window Title
        stage.setTitle("Guess the lucky number!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}