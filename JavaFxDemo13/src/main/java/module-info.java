module com.example.javafxdemo13 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo13 to javafx.fxml;
    exports com.example.javafxdemo13;
}