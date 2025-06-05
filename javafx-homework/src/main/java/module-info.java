module com.wtc {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive java.sql;
    requires transitive javafx.graphics;
    requires lombok;

    exports com.wtc;
    exports com.wtc.staff;
    exports com.wtc.e311;
}
