package com.example.javafxdemo25;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Laborator 8");

        GridPane grid = new GridPane(); //layout
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //User label
        Label userLabel = new Label("Username");
        userLabel.setId("bold-label");
        GridPane.setConstraints(userLabel,0,0);
        //userLabel.setStyle("-fx-text-fill: aliceblue");

        //User input
        TextField userInput = new TextField("DefaultText");
        GridPane.setConstraints(userInput,1,0);

        //Password label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel,0,1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("Hint: test");
        GridPane.setConstraints(passInput,1,1);

        Button loginBtn = new Button("Login: ");
        GridPane.setConstraints(loginBtn,1,2);

        Button signupBtn = new Button("Signup: ");
        signupBtn.getStyleClass().add("button-blue");
        GridPane.setConstraints(signupBtn,1,3);

//        loginBtn.setOnAction(e -> {
//            setUserAgentStylesheet(STYLESHEET_CASPIAN);
//        });

        grid.getChildren().addAll(userLabel,passLabel,userInput,passInput,loginBtn,signupBtn);

        Scene scene = new Scene(grid, 300,200);
        scene.getStylesheets().add(Client.class.getResource("Viper.css").toExternalForm());
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch();
    }
}