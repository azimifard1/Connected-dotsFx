package com.example.connectdotsfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new Window());
        stage.setTitle("Dot Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}
