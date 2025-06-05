// Exercise15_05
package com.wtc;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(2);
        gridPane.setAlignment(Pos.CENTER);

        Label label1 = new Label("Investment Amount:");
        Label label2 = new Label("Number of Years:");
        Label label3 = new Label("Annual Interest Rate:");
        Label label4 = new Label("Future Value:");

        TextField investmentAmountField = new TextField();
        TextField numberOfYearsField = new TextField();
        TextField annualInterestRateField = new TextField();
        TextField futureValueText = new TextField();
        futureValueText.setEditable(false);

        Button calculateButton = new Button("Calculate");

        investmentAmountField.setAlignment(Pos.BOTTOM_RIGHT);
        numberOfYearsField.setAlignment(Pos.BOTTOM_RIGHT);
        annualInterestRateField.setAlignment(Pos.BOTTOM_RIGHT);
        futureValueText.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(calculateButton, HPos.RIGHT);

        gridPane.add(label1, 0, 0);
        gridPane.add(investmentAmountField, 1, 0);
        gridPane.add(label2, 0, 1);
        gridPane.add(numberOfYearsField, 1, 1);
        gridPane.add(label3, 0, 2);
        gridPane.add(annualInterestRateField, 1, 2);
        gridPane.add(label4, 0, 3);
        gridPane.add(futureValueText, 1, 3);
        gridPane.add(calculateButton, 1, 4);
        calculateButton.setOnAction(event -> {
            double investmentAmount = Double.parseDouble(investmentAmountField.getText());
            int numberOfYears = Integer.parseInt(numberOfYearsField.getText());
            double annualInterestRate = Double.parseDouble(annualInterestRateField.getText());
            double monthlyInterestRate = annualInterestRate / 1200;
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
            futureValueText.setText(String.format("$%.2f", futureValue));
        });

        primaryStage.setTitle("Exercise15_05");
        primaryStage.setScene(new Scene(gridPane, 400, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
