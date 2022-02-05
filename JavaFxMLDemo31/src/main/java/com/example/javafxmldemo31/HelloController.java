package com.example.javafxmldemo31;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    public Button button;

    public void handlebuttonclick(){
        System.out.println("Run some code the user does not see");
        button.setText("Stop!!");
    }
}