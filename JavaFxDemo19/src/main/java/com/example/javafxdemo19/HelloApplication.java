package com.example.javafxdemo19;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Scene scene;
    TableView<Products> table;
    TextField nameInput, priceInput, quantityInput;

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

        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.minWidth(100);

        //Price input
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.minWidth(100);

        //Quantity input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.minWidth(100);

        //Buttons
        Button addbtn = new Button("Add");
        addbtn.setOnAction(e -> addbtnClicked());

        Button delbtn = new Button("Delete");
        delbtn.setOnAction(e -> delbtnClicked());

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(nameInput,priceInput,quantityInput,addbtn,delbtn);

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table,hbox);

        scene = new Scene(layout);
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

    public void addbtnClicked(){
        Products product = new Products();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    public void delbtnClicked(){
        ObservableList<Products> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);
    }

    public static void main(String[] args) {
        launch();
    }
}