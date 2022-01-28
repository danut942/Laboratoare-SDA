package com.example.javafxdemo14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    Button btn;
    ComboBox<String> comboBox;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("JavaFx 14 - ComboBox");

        //Buttons
        btn = new Button("Submit!");


        //ComboBox
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("SpiderMan","Avengers","The dark knight");
        comboBox.setPromptText("What is your favourite movie? ");

        btn.setOnAction(e -> printMovie());
        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));
        comboBox.setEditable(true);

        VBox layout = new VBox(20);
        scene = new Scene(layout,300,200);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(comboBox,btn);

        window.setScene(scene);
        window.show();
    }

    private void printMovie(){
        System.out.println(comboBox.getValue());
    }

    public static void main(String[] args) {
        launch();
    }
}