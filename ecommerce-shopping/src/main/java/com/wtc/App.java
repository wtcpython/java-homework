package com.wtc;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginPage.setLoginPage(primaryStage);
        // UserInfoPage.setUserInfoPage(primaryStage);
        // SearchPage.setSearchPage(primaryStage);
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
