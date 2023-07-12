module modelo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens modelo to javafx.fxml;
    exports modelo;
}
