package com.example.javafxmodeltest2_3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collection;

public class HelloApplication extends Application {

    TextField numeInput;
    Button btnAdauga,btnAfiseaza,btnCiteste,btnInfoAutor,btnBack;
    Label lblAutor;
    ListView<String> listafacultati;
    TextArea txtArea;
    Stage window;
    Scene scene1,scene2;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Test 2 Sacu Danut");

        VBox vbox1 = new VBox();
        vbox1.setMinWidth(150);
        vbox1.setPadding(new Insets(20));
        vbox1.setSpacing(50);

        HBox hbox1 = new HBox();
        hbox1.setPadding(new Insets(20));
        hbox1.setSpacing(50);

        VBox vbox2 = new VBox();
        vbox2.setPadding(new Insets(20));


        numeInput = new TextField("Nume");
        numeInput.setMinWidth(vbox1.getMinWidth());
        btnAdauga = new Button("Adauga");
        btnAdauga.setMinWidth(vbox1.getMinWidth());
        btnAfiseaza = new Button("Afiseaza");
        btnAfiseaza.setMinWidth(vbox1.getMinWidth());
        btnCiteste = new Button("Citeste");
        btnCiteste.setMinWidth(vbox1.getMinWidth());
        txtArea = new TextArea("Introdu text..");
        listafacultati = new ListView<>();
        listafacultati.getItems().addAll("FIESC","FSEAP","FIA");
        btnInfoAutor = new Button("Info Autor:");
        btnInfoAutor.setMinWidth(vbox1.getMinWidth());
        btnBack = new Button("back");
        lblAutor = new Label("Sacu Danut - Test 2");

        //Events
        btnInfoAutor.setOnAction(e -> window.setScene(scene2));
        btnBack.setOnAction(e -> window.setScene(scene1));
        //btnAdauga.setOnAction(e-> listafacultati.getItems().addAll(numeInput.getText()));
        btnAdauga.setOnAction(e-> listafacultati.getItems().addAll(numeInput.getText()));

        //Scene2
        VBox layout2 = new VBox(10);
        layout2.setPadding(new Insets(30));
        layout2.getChildren().addAll(lblAutor,btnBack);
        scene2 = new Scene(layout2,300,200);


        vbox1.getChildren().addAll(numeInput,btnAdauga,btnAfiseaza,btnCiteste,btnInfoAutor);
        hbox1.getChildren().addAll(vbox1,listafacultati);
        vbox2.getChildren().addAll(hbox1,txtArea);

        scene1 = new Scene(vbox2);
        window.setScene(scene1);
        window.show();

    }
    public void adauga(){

    }

    public static void main(String[] args) {
        launch();
    }
}