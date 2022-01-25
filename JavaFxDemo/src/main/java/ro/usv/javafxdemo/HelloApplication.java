package ro.usv.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
        window.setTitle("creating alert boxes");

        Button button= new Button("Click me");
        button.setOnAction(e -> AlertBox.display("Title of window", "Wow this alert box is awesome"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();

    }
}