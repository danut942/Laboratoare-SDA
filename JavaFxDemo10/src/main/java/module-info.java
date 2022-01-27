module com.example.javafxdemo10 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo10 to javafx.fxml;
    exports com.example.javafxdemo10;
}