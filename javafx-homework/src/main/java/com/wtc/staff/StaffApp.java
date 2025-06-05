package com.wtc.staff;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StaffApp extends Application {
    private TextField idField = new TextField();
    private TextField lastNameField = new TextField();
    private TextField firstNameField = new TextField();
    private TextField miField = new TextField();
    private TextField addressField = new TextField();
    private TextField cityField = new TextField();
    private TextField stateField = new TextField();
    private TextField telephoneField = new TextField();

    private StaffService staffService = new StaffService();

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        borderPane.setTop(new Label("Record found"));

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(new Label("ID"), 0, 0);
        gridPane.add(idField, 1, 0);

        gridPane.add(new Label("Last Name"), 0, 1);
        gridPane.add(lastNameField, 1, 1);

        gridPane.add(new Label("First Name"), 2, 1);
        gridPane.add(firstNameField, 3, 1);

        gridPane.add(new Label("MI"), 4, 1);
        gridPane.add(miField, 5, 1);

        gridPane.add(new Label("Address"), 0, 2);
        gridPane.add(addressField, 1, 2);

        gridPane.add(new Label("City"), 0, 3);
        gridPane.add(cityField, 1, 3);

        gridPane.add(new Label("State"), 2, 3);
        gridPane.add(stateField, 3, 3);

        gridPane.add(new Label("Telephone"), 0, 4);
        gridPane.add(telephoneField, 1, 4);

        borderPane.setCenter(gridPane);

        HBox hBox = new HBox(10);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button viewButton = new Button("View");
        Button inserButton = new Button("Insert");
        Button updateButton = new Button("Update");
        Button clearButton = new Button("Clear");

        viewButton.setOnAction(e -> view());
        inserButton.setOnAction(e -> insert());
        updateButton.setOnAction(e -> update());
        clearButton.setOnAction(e -> clear());

        hBox.getChildren().addAll(viewButton, inserButton, updateButton, clearButton);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ExtraExercise32_01");
        primaryStage.show();
    }

    private void view() {
        String id = idField.getText().trim();
        Staff staff = staffService.getStaffById(id);
        if (staff != null) {
            lastNameField.setText(staff.getLastName());
            firstNameField.setText(staff.getFirstName());
            miField.setText(staff.getMi());
            addressField.setText(staff.getAddress());
            cityField.setText(staff.getCity());
            stateField.setText(staff.getState());
            telephoneField.setText(staff.getTelephone());
        } else {
            clear();
        }
    }

    private void insert() {
        Staff staff = new Staff();
        staff.setId(idField.getText().trim());
        staff.setLastName(lastNameField.getText().trim());
        staff.setFirstName(firstNameField.getText().trim());
        staff.setMi(miField.getText().trim());
        staff.setAddress(addressField.getText().trim());
        staff.setCity(cityField.getText().trim());
        staff.setState(stateField.getText().trim());
        staff.setTelephone(telephoneField.getText().trim());

        staffService.addStaff(staff);
    }

    private void update() {
        Staff staff = new Staff();
        staff.setId(idField.getText().trim());
        staff.setLastName(lastNameField.getText().trim());
        staff.setFirstName(firstNameField.getText().trim());
        staff.setMi(miField.getText().trim());
        staff.setAddress(addressField.getText().trim());
        staff.setCity(cityField.getText().trim());
        staff.setState(stateField.getText().trim());
        staff.setTelephone(telephoneField.getText().trim());

        staffService.modifyStaff(staff);
    }

    private void clear() {
        idField.clear();
        lastNameField.clear();
        firstNameField.clear();
        miField.clear();
        addressField.clear();
        cityField.clear();
        stateField.clear();
        telephoneField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
