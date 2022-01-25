package com.example.javafxdemo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch( );
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("creating confirm box");

        Button button= new Button("Click me");
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of window", "Are you sure?");
            System.out.println("Result");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();

    }
}