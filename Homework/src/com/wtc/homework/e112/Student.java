// Exercise 11.2
package com.wtc.homework.e112;

public class Student extends Person {
    public enum Status {
        Freshman,
        Sophomore,
        Junior,
        Senior
    };
    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public Student() {
        super();
        this.status = Status.Freshman;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student [status=" + status + "]";
    }
}
