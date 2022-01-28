module com.example.javafxdemo12 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo12 to javafx.fxml;
    exports com.example.javafxdemo12;
}