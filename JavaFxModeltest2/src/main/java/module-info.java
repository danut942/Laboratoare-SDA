module com.example.javafxmodeltest2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
        
    opens com.example.javafxmodeltest2 to javafx.fxml;
    exports com.example.javafxmodeltest2;
}