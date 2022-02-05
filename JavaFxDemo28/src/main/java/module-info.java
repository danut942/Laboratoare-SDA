module com.example.javafxdemo28 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo28 to javafx.fxml;
    exports com.example.javafxdemo28;
}