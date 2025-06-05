package com.wtc.e311;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Server extends Application {
    private TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        textArea.setWrapText(true);
        textArea.setEditable(false);

        primaryStage.setTitle("Server");
        primaryStage.setScene(new Scene(textArea));
        primaryStage.show();

        new Thread(() -> connect()).start();
    }

    public void connect() {
        try (ServerSocket ss = new ServerSocket(8000)) {
            textArea.appendText("Server started at " + new Date() + '\n');

            Socket socket = ss.accept();
            textArea.appendText("Connected to a client at " + new Date() + '\n');
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while (true) {
                double annualInterestRate = dis.readDouble();
                int numberOfYears = dis.readInt();
                double loanAmount = dis.readDouble();

                Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
                textArea.appendText("Received: " + loan + '\n');

                dos.writeDouble(loan.getMonthlyPayment());
                dos.writeDouble(loan.getTotalPayment());
                textArea.appendText("Sent monthly payment and total payment to client\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
