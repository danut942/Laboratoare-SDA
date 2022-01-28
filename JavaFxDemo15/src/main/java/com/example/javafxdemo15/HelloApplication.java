package com.example.javafxdemo15;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    Button btn;
    ListView<String> listView;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("JavaFx15 ListView");

        btn = new Button("Submit!");

        listView = new ListView<>();
        listView.getItems().addAll("Iron Man","Titanic","Contact","Surrogates");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        btn.setOnAction(e -> btnClick());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(listView,btn);

        scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();
    }

    //Print out movies
    private void btnClick(){
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m: movies){
            message += m + "\n";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        launch();
    }
}