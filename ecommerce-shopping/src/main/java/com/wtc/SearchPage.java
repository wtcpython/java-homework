package com.wtc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchPage {
    public static void setSearchPage(Stage primaryStage) {
        primaryStage.setTitle("电商购物平台-商品查询页面");

        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        HBox topHBox = new HBox();
        BorderPane.setMargin(topHBox, new Insets(10));

        Text welcomeText = new Text("您好，" + Info.username);
        Text locationText = new Text("来自于：" + Info.location);

        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        topHBox.getChildren().addAll(welcomeText, region, locationText);

        borderPane.setTop(topHBox);

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Text bookText = new Text("书籍名：");

        TextField bookField = new TextField();

        Text classifyText = new Text("分类：");

        ComboBox<String> classifyComboBox = new ComboBox<>();
        classifyComboBox.getItems().addAll("- 请选择 -", "工具类>软件编程", "小说类>历史");
        classifyComboBox.setValue("- 请选择 -");

        Button searchButton = new Button("查询");

        hBox.getChildren().addAll(bookText, bookField, classifyText, classifyComboBox, searchButton);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        BorderPane.setMargin(vBox, new Insets(10));

        vBox.getChildren().add(hBox);

        TableView<BookInfo> tableView = new TableView<>();

        TableColumn<BookInfo, String> idColumn = new TableColumn<>("书籍编号");
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        TableColumn<BookInfo, String> nameColumn = new TableColumn<>("书籍名称");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        TableColumn<BookInfo, String> authorColumn = new TableColumn<>("书籍作者");
        authorColumn.setCellValueFactory(cellData -> cellData.getValue().authorProperty());
        TableColumn<BookInfo, Integer> numberColumn = new TableColumn<>("库存");
        numberColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty().asObject());
        TableColumn<BookInfo, String> classifyColumn = new TableColumn<>("书籍分类");
        classifyColumn.setCellValueFactory(cellData -> cellData.getValue().classifyProperty());

        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);
        tableView.getColumns().add(idColumn);
        tableView.getColumns().add(nameColumn);
        tableView.getColumns().add(authorColumn);
        tableView.getColumns().add(numberColumn);
        tableView.getColumns().add(classifyColumn);

        ObservableList<BookInfo> bookList = FXCollections.observableArrayList();

        try (InputStream is = SearchPage.class.getResourceAsStream("/book.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                System.out.println(Arrays.toString(parts));
                if (parts.length == 5) {
                    BookInfo bookInfo = new BookInfo(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]),
                            parts[4]);
                    bookList.add(bookInfo);
                }
            }
            tableView.setItems(bookList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        searchButton.setOnAction(e -> {
            String bookName = bookField.getText();
            String classify = classifyComboBox.getValue();
            ObservableList<BookInfo> filteredList = FXCollections.observableArrayList();

            for (BookInfo book : bookList) {
                if (book.getName().contains(bookName) && (classify.equals("- 请选择 -")
                        || book.getClassify().equals(classify))) {
                    filteredList.add(book);
                }
            }
            tableView.setItems(filteredList);

            if (filteredList.isEmpty()) {
                showDialog();
            }
        });

        vBox.getChildren().add(tableView);

        borderPane.setCenter(vBox);

        HBox bottomHBox = new HBox();
        bottomHBox.setSpacing(10);
        bottomHBox.setAlignment(Pos.CENTER_LEFT);

        Text countText = new Text("购物车商品数：0件");
        Text infoText = new Text("查看详情");

        Button buyButton = new Button("购买");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        bottomHBox.getChildren().addAll(countText, infoText, spacer, buyButton);

        borderPane.setBottom(bottomHBox);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
    }

    public static void showDialog() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("警告信息");
        alert.setHeaderText(null);
        alert.setContentText("没有满足条件的书籍信息");
        alert.showAndWait();
    }
}
