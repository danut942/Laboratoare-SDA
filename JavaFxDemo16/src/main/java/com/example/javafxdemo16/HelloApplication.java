package com.example.javafxdemo16;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    TreeView<String> tree;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("JavaFx16 - Treeview");
        TreeItem<String> root,bucky,megan;

        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        //Bucky
        bucky = makeBranch("Bucky", root);
        makeBranch ("thenewboston",bucky);
        makeBranch ("youtube",bucky);
        makeBranch ("twitter",bucky);

        //Megan
        megan = makeBranch("Megan", root);
        makeBranch ("facebook",megan);
        makeBranch ("isntagram",megan);

        //Create tree
        tree = new TreeView <> (root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue) -> {
            if(newValue != null)
                System.out.println(newValue.getValue());
        });

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();
    }

    //Create branches
    public TreeItem<String> makeBranch (String title,TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

    public static void main(String[] args) {
        launch();
    }
}