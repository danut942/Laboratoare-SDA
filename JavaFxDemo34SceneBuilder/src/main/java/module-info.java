module com.example.javafxdemo34scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo34scenebuilder to javafx.fxml;
    exports com.example.javafxdemo34scenebuilder;
}