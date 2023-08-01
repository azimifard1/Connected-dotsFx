module com.example.connectdotsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.connectdotsfx to javafx.fxml;
    exports com.example.connectdotsfx;
}