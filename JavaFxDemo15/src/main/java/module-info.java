module com.example.javafxdemo15 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo15 to javafx.fxml;
    exports com.example.javafxdemo15;
}