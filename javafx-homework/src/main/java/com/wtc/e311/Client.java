package com.wtc.e311;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Client extends Application {
    private TextField annualInterestRateField = new TextField();
    private TextField numberOfYearsField = new TextField();
    private TextField loanAmountField = new TextField();

    private DataOutputStream dos;
    private DataInputStream dis;

    private TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(new Label("Annual Interest Rate"), 0, 0);
        gridPane.add(annualInterestRateField, 1, 0);

        gridPane.add(new Label("Number Of Years"), 0, 1);
        gridPane.add(numberOfYearsField, 1, 1);

        gridPane.add(new Label("Loan Amount"), 0, 2);
        gridPane.add(loanAmountField, 1, 2);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> submit());
        gridPane.add(submitButton, 2, 1);

        connect();

        textArea.setWrapText(true);
        textArea.setEditable(false);

        VBox vbox = new VBox(10, gridPane, textArea);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox);
        primaryStage.setTitle("Client");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void connect() {
        try {
            Socket socket = new Socket("localhost", 8000);
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void submit() {
        try {
            double annualInterestRate = Double.parseDouble(annualInterestRateField.getText());
            int numberOfYears = Integer.parseInt(numberOfYearsField.getText());
            double loanAmount = Double.parseDouble(loanAmountField.getText());

            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            dos.writeDouble(annualInterestRate);
            dos.writeInt(numberOfYears);
            dos.writeDouble(loanAmount);
            dos.flush();

            double monthlyPayment = dis.readDouble();
            double totalPayment = dis.readDouble();

            textArea.appendText(loan + "\n");
            textArea.appendText("Monthly Payment: " + monthlyPayment + "\n");
            textArea.appendText("Total Payment: " + totalPayment + "\n");

        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
