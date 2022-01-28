module com.example.javafxdemo11 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo11 to javafx.fxml;
    exports com.example.javafxdemo11;
}