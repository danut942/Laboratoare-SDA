module com.example.javafxdemo21 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo21 to javafx.fxml;
    exports com.example.javafxdemo21;
}