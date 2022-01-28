package com.example.javafxdemo11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
        window.setTitle("JavaFx 11");

        //Checkboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        //Button
        btn = new Button("Order now!");
        btn.setOnAction(e -> handleOptions(box1,box2));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1, box2, btn);

        scene = new Scene(layout,300,200);
        window.setScene(scene);

        window.show();


    }

    //Handle checkbox options
    private void handleOptions(CheckBox box1,CheckBox box2){
        String message = "Users order:\n";

        if(box1.isSelected())
            message += "Bacon\n";

        if(box2.isSelected())
            message += "Tuna\n";

        System.out.println(message);
    }

    public static void main(String[] args) {
        launch();
    }
}