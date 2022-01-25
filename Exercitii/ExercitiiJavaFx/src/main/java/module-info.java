module com.example.exercitiijavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercitiijavafx to javafx.fxml;
    exports com.example.exercitiijavafx;
}