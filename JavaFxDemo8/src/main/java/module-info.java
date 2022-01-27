module com.example.javafxdemo8 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo8 to javafx.fxml;
    exports com.example.javafxdemo8;
}