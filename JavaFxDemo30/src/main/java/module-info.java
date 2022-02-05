module com.example.javafxdemo30 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo30 to javafx.fxml;
    exports com.example.javafxdemo30;
}