module ro.usv.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ro.usv.javafxdemo to javafx.fxml;
    exports ro.usv.javafxdemo;
}