module com.example.parcial1progra2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.parcial1progra2 to javafx.fxml;
    exports com.example.parcial1progra2;
}