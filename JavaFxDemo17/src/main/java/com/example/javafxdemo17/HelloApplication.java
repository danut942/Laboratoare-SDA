package com.example.javafxdemo17;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    TableView<Products> table;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("JavaFx - Introduction to tableview");

        //Name column
        TableColumn<Products, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Products, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity columnn
        TableColumn<Products, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table);

        scene = new Scene(layout, 700, 500);
        window.setScene(scene);
        window.show();
    }

    //Get all of the products
    public ObservableList<Products> getProduct(){
        ObservableList<Products> product = FXCollections.observableArrayList();
        product.add(new Products("laptop",859.12,20));
        product.add(new Products("ball",2.00,11));
        product.add(new Products("tv",22.12,3));
        product.add(new Products("headphones",40.23,68));
        product.add(new Products("table",111.31,1));
        return product;
    }

    public static void main(String[] args) {
        launch();
    }
}