module com.example.javafxdemo16 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo16 to javafx.fxml;
    exports com.example.javafxdemo16;
}