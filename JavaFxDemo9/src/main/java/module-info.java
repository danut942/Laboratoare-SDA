module com.example.javafxdemo9 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo9 to javafx.fxml;
    exports com.example.javafxdemo9;
}