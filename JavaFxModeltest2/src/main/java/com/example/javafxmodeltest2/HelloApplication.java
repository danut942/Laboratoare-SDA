package com.example.javafxmodeltest2;

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
import java.util.List;

public class HelloApplication extends Application {

    Label nrZile;
    Button btnImprumuta, btnReturneaza,btnImprumuturi,btnsituatieImprumut, btnInfoAutor,btnFisaStud;
    TextField inputZile;
    ListView<String> listaCarti;
    ListView<String> listaStudenti;
    Stage window;
    Scene scene;
    TextArea txtArea;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Test2");

        nrZile = new Label("Nr Zile");
        listaCarti = new ListView<>();
        listaStudenti = new ListView<>();
        inputZile = new TextField();
        btnImprumuta = new Button("Imprumuta");
        btnsituatieImprumut = new Button ("Situatie Imprumut");
        btnReturneaza = new Button("Returneaza");
        btnImprumuturi = new Button("Imprumuturi mai mari de ...");
        btnInfoAutor = new Button("Info Autor");
        btnFisaStud = new Button("Fisa Stud");
        txtArea = new TextArea();
        listaStudenti.maxWidth(50);

        HBox hbox = new HBox();
        HBox hbox2 = new HBox();
        VBox vbox = new VBox(10);
        VBox vbox2 = new VBox (10);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(50);
        vbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));
        hbox2.setSpacing(100);
        vbox.getChildren().addAll(nrZile,inputZile, btnImprumuta,btnReturneaza,btnImprumuturi);
        hbox.getChildren().addAll(listaCarti,vbox,listaStudenti);
        hbox2.getChildren().addAll(btnsituatieImprumut,btnInfoAutor,btnFisaStud);
        vbox2.getChildren().addAll(hbox,hbox2,txtArea);
        scene = new Scene(vbox2,800,600);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}