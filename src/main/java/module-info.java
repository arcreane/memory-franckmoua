module com.example.javamemory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javamemory to javafx.fxml;
    exports com.example.javamemory;
}