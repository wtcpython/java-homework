package com.wtc;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BookInfo {
    private StringProperty id;
    private StringProperty name;
    private StringProperty author;
    private IntegerProperty number;
    private StringProperty classify;

    BookInfo() {
    }

    BookInfo(String id, String name, String author, Integer number, String classify) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.author = new SimpleStringProperty(author);
        this.number = new SimpleIntegerProperty(number);
        this.classify = new SimpleStringProperty(classify);
    }

    public StringProperty idProperty() {
        return id;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty authorProperty() {
        return author;
    }

    public IntegerProperty numberProperty() {
        return number;
    }

    public StringProperty classifyProperty() {
        return classify;
    }

    public String getId() {
        return id.get();
    }

    public void setId(String id) {
        this.id = new SimpleStringProperty(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getAuthor() {
        return author.get();
    }

    public void setAuthor(String author) {
        this.author = new SimpleStringProperty(author);
    }

    public Integer getNumber() {
        return number.get();
    }

    public void setNumber(Integer number) {
        this.number = new SimpleIntegerProperty(number);
    }

    public String getClassify() {
        return classify.get();
    }

    public void setClassify(String classify) {
        this.classify = new SimpleStringProperty(classify);
    }
}
