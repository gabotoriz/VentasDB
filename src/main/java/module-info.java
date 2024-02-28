module utc.mx.ventasdashboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens utc.mx.ventasdashboard to javafx.fxml;
    exports utc.mx.ventasdashboard;
}