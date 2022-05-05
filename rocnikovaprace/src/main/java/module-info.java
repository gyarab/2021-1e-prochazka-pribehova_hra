module com.example.rocnikovaprace {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.example.rocnikovaprace to javafx.fxml;
    exports com.example.rocnikovaprace;
}