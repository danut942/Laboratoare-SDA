module com.example.javafxdemo19 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo19 to javafx.fxml;
    exports com.example.javafxdemo19;
}