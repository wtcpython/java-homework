package com.wtc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserInfoPage {
    public static void setUserInfoPage(Stage primaryStage) {
        primaryStage.setTitle("电商购物平台-用户信息");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(10));

        Text accountText = new Text("登录账号：");
        Text accountField = new Text(Info.account);
        Text nameText = new Text("真实姓名：");
        TextField nameField = new TextField(Info.username);

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER_LEFT);

        Text SexText = new Text("用户性别：");
        ToggleGroup sexGroup = new ToggleGroup();
        RadioButton maleRadioButton = new RadioButton("男");
        maleRadioButton.setToggleGroup(sexGroup);
        RadioButton femaleRadioButton = new RadioButton("女");
        femaleRadioButton.setToggleGroup(sexGroup);
        maleRadioButton.setSelected(true);

        hBox.getChildren().addAll(maleRadioButton, femaleRadioButton);

        Text locationText = new Text("所在地：");
        ComboBox<String> locationComboBox = new ComboBox<>();
        locationComboBox.getItems().addAll("北京", "上海", "广州", "深圳", "杭州", "成都", "武汉", "西安", "南京", "重庆");
        locationComboBox.setValue("北京");

        Button confirmButton = new Button("确定");
        confirmButton.setPrefWidth(100);
        Button returnButton = new Button("返回");
        returnButton.setPrefWidth(100);

        confirmButton.setOnAction(event -> {
            Info.username = nameField.getText();
            Info.sex = maleRadioButton.isSelected() ? "男" : "女";
            Info.location = locationComboBox.getValue();
            System.out.println("用户信息已保存！");
            SearchPage.setSearchPage(primaryStage);
        });

        returnButton.setOnAction(event -> {
            // primaryStage.setScene(MainPage.getMainPage(primaryStage));
        });

        gridPane.add(accountText, 0, 0);
        gridPane.add(accountField, 1, 0);
        gridPane.add(nameText, 0, 1);
        gridPane.add(nameField, 1, 1);
        gridPane.add(SexText, 0, 2);
        gridPane.add(hBox, 1, 2);
        gridPane.add(locationText, 0, 3);
        gridPane.add(locationComboBox, 1, 3);
        gridPane.add(confirmButton, 0, 4);
        gridPane.add(returnButton, 1, 4);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
    }
}
