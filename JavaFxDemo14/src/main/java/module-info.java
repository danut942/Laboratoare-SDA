module com.example.javafxdemo14 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo14 to javafx.fxml;
    exports com.example.javafxdemo14;
}