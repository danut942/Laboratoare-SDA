module com.example.javafxdemo17 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo17 to javafx.fxml;
    exports com.example.javafxdemo17;
}