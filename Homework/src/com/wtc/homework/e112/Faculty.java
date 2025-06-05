package com.wtc.homework.e112;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty() {
        super();
        this.officeHours = "";
        this.rank = "";
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty [officeHours=" + officeHours + ", rank=" + rank + "]";
    }

}
