// Exercise14_09
package com.wtc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FansApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(2);
        gridPane.setVgap(2);

        gridPane.add(new MyFan(), 0, 0);
        gridPane.add(new MyFan(), 0, 1);
        gridPane.add(new MyFan(), 1, 0);
        gridPane.add(new MyFan(), 1, 1);

        primaryStage.setTitle("Exercise14_09");
        primaryStage.setScene(new Scene(gridPane, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
