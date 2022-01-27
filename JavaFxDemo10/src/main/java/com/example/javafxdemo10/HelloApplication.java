package com.example.javafxdemo10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
//Get data from form fields and validate them
public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    Button btn;

    @Override
    public void start(Stage stage) throws IOException {
       window = stage;
       window.setTitle("Laborator 10");

       //Form
        TextField nameInput = new TextField();

        btn = new Button("Click me!");
        btn.setOnAction(e -> isInt(nameInput,nameInput.getText()));


        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput,btn);

        scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();

    }

    private boolean isInt(TextField input,String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("The user is: " + age);
        }catch (NumberFormatException e) {
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        launch();
    }
}