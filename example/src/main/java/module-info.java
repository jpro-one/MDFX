module mdfx.example.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires jpro.webapi;
    requires com.sandec.mdfx;
    requires org.apache.commons.io;
    requires fr.brouillard.oss.cssfx;

    opens com.sandec.mdfx.example;
    exports com.sandec.mdfx.example;
}