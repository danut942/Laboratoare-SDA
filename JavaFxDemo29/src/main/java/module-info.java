module com.example.javafxdemo29 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo29 to javafx.fxml;
    exports com.example.javafxdemo29;
}