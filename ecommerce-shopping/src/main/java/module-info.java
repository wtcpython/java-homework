module com.wtc {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires javafx.base;

    opens com.wtc to javafx.fxml;

    exports com.wtc;
}
