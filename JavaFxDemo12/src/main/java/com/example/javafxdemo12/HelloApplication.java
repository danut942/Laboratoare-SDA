package com.example.javafxdemo12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    Button btn;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("JavaFx12 - ChoiceBox");

        //Buttons
        btn = new Button("Click me");

        //Dropdown list
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems return the observableList object which you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().add("Oranges");
        choiceBox.getItems().addAll("Pineapple","Pair");

        //Set a default value
        choiceBox.setValue("Bananas");

        btn.setOnAction(e -> getChoice(choiceBox));

        //Layout
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(btn,choiceBox);

        scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();
    }

    //To get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food);

    }

    public static void main(String[] args) {
        launch();
    }
}