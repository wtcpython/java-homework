// Exercise 11.2
package com.wtc.homework.e112;

import java.util.GregorianCalendar;

class MyDate {
    private int year;
    private int month;
    private int day;

    MyDate() {
        GregorianCalendar date = new GregorianCalendar();
        this.year = date.get(1);
        this.month = date.get(2);
        this.day = date.get(5);
    }

    MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(1);
        this.month = date.get(2);
        this.day = date.get(5);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
    }
}
