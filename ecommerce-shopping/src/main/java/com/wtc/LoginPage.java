package com.wtc;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPage {
    public static void setLoginPage(Stage primaryStage) {
        primaryStage.setTitle("电商购物平台-登录");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(10));

        Text accountLabel = new Text("登录账号：");
        TextField accountField = new TextField();
        Text passwordLabel = new Text("登录密码：");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("登录");
        Button resetButton = new Button("重置");

        gridPane.add(accountLabel, 0, 0);
        gridPane.add(accountField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);

        gridPane.add(loginButton, 0, 2);
        gridPane.add(resetButton, 1, 2);
        GridPane.setHalignment(resetButton, HPos.RIGHT);

        // Set the action for the login button
        loginButton.setOnAction(event -> {
            String account = accountField.getText();
            String password = passwordField.getText();
            System.out.println("Account: " + account + ", Password: " + password);
            boolean isSuccess = (Info.account.equals(account) && Info.password.equals(password));
            showDialog(isSuccess, primaryStage);
        });

        // Set the action for the reset button
        resetButton.setOnAction(event -> {
            accountField.clear();
            passwordField.clear();
        });

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
    }

    public static void showDialog(boolean isSuccess, Stage primaryStage) {
        if (isSuccess) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("信息");
            alert.setHeaderText(null);
            alert.setContentText("登录成功！");
            alert.showAndWait();
            UserInfoPage.setUserInfoPage(primaryStage);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("警告信息");
            alert.setHeaderText(null);
            alert.setContentText("登录账号或密码不正确！");
            alert.showAndWait();
        }
    }
}
