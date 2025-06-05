// Exercise 11.2
package com.wtc.homework.e112;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String office, double salary, MyDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee() {
        this("", 0.0, new MyDate());
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
    }

}
