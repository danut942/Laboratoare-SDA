module com.example.javafxmldemo31 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxmldemo31 to javafx.fxml;
    exports com.example.javafxmldemo31;
}