package com.wtc.homework.e112;

public class Staff extends Employee {
    private String title;

    public Staff(String office, double salary, MyDate dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [title=" + title + "]";
    }

}
