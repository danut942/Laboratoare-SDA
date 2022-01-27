package com.example.javafxdemo8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Laborator 8");

        HBox topMenu = new HBox();
        Button btnA = new Button("File");
        Button btnB = new Button("Edit");
        Button btnC = new Button("View");
        topMenu.getChildren().addAll(btnA,btnB,btnC);

        VBox leftMenu = new VBox();
        Button btnA1 = new Button("d");
        Button btnB1 = new Button("e");
        Button btnC1 = new Button("f");
        leftMenu.getChildren().addAll(btnA1,btnB1,btnC1);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        StackPane layout = new StackPane();
        Scene scene = new Scene(borderPane,300,200);
        window.setScene(scene);
        window.show();

    }
}