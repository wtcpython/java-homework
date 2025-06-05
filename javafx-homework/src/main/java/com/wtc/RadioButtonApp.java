// Exercise16_01
package com.wtc;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonApp extends Application {
    private Pos pos = Pos.CENTER;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);

        ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Red");
        RadioButton rb2 = new RadioButton("Yellow");
        RadioButton rb3 = new RadioButton("Black");
        RadioButton rb4 = new RadioButton("Orange");
        RadioButton rb5 = new RadioButton("Green");

        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);
        rb3.setSelected(true);
        rb4.setToggleGroup(group);
        rb5.setToggleGroup(group);

        Text text = new Text("Programming is fun");

        rb1.setOnAction(e -> text.setFill(Color.RED));
        rb2.setOnAction(e -> text.setFill(Color.YELLOW));
        rb3.setOnAction(e -> text.setFill(Color.BLACK));
        rb4.setOnAction(e -> text.setFill(Color.ORANGE));
        rb5.setOnAction(e -> text.setFill(Color.GREEN));

        hBox.getChildren().addAll(rb1, rb2, rb3, rb4, rb5);
        borderPane.setTop(hBox);

        borderPane.setCenter(text);

        HBox hBox2 = new HBox();
        hBox2.setAlignment(Pos.CENTER);

        Button bt1 = new Button("<=");
        Button bt2 = new Button("=>");
        hBox2.getChildren().addAll(bt1, bt2);
        borderPane.setBottom(hBox2);

        bt1.setOnAction(e -> {
            if (pos == Pos.CENTER) {
                pos = Pos.CENTER_LEFT;
            } else if (pos == Pos.CENTER_RIGHT) {
                pos = Pos.CENTER;
            }
            BorderPane.setAlignment(text, pos);
        });
        bt2.setOnAction(e -> {
            if (pos == Pos.CENTER) {
                pos = Pos.CENTER_RIGHT;
            } else if (pos == Pos.CENTER_LEFT) {
                pos = Pos.CENTER;
            }
            BorderPane.setAlignment(text, pos);
        });

        primaryStage.setTitle("Exercise16_01");
        primaryStage.setScene(new Scene(borderPane, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
