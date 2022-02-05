package com.example.javafxdemo28;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    Button button;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Java FX - Properties");

        Person ob = new Person();
        ob.firstNameProperty().addListener ((v,oldValue,newValue) -> {
            System.out.println("Name changed to: " + newValue);
            System.out.println("firstNameProperty(): " + ob.firstNameProperty());
            System.out.println("firstNameProperty(): " + ob.firstNameProperty().getName());
            System.out.println("firstNameProperty(): " + ob.firstNameProperty().getValue());
            System.out.println("getFirstName(): " + ob.getFirstName());
        });

        button = new Button("Submit");
        button.setOnAction(e -> ob.setFirstName("John"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}