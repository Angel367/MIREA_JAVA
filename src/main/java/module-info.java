module com.example.mirea_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mirea_java to javafx.fxml;
    exports com.example.mirea_java;
}