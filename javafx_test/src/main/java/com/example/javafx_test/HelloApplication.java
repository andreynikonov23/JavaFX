package com.example.javafx_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.show();
        stage.setTitle("JavaFX Test");
        stage.setWidth(450);
        stage.setHeight(550);
        stage.setResizable(false);
        Image icon = new Image(String.valueOf(getClass().getResource("icon.png")));
        stage.getIcons().add(icon);
        Label label = new Label("Hello World!");
        Scene scene = new Scene(label);
        label.setAlignment(Pos.CENTER);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}