module com.example.javafxdemo2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.javafxdemo2 to javafx.fxml;
    exports com.example.javafxdemo2;
}