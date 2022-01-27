package com.example.javafxdemo7;

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
        window.setTitle("JavaFx tutorials");

        window.setOnCloseRequest(e -> {
            e.consume(); // request the close * consum the event
            closeProgram();
        });

        button = new Button ("Close Program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display("Title", "Are you sure you want to exit?");
        if(answer)
            window.close();
    }
}