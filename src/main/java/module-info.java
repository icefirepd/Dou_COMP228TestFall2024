module com.lab.fangdou_comp228testfall2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.lab.fangdou_comp228testfall2024 to javafx.fxml;
    exports com.lab.fangdou_comp228testfall2024;
    exports controllers;
    opens controllers to javafx.fxml;
}