module com.example.javafxdemo7 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo7 to javafx.fxml;
    exports com.example.javafxdemo7;
}