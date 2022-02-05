module com.example.javafxmldemo33 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxmldemo33 to javafx.fxml;
    exports com.example.javafxmldemo33;
}