module com.example.javafxdemo25 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo25 to javafx.fxml;
    exports com.example.javafxdemo25;
}