package com.wtc.homework.e112;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Tom", "Beijing", "123456789", "tom@gmail.com");
        Student student = new Student("Tom", "Beijing", "123456789", "tom@gmail.com", Student.Status.Freshman);
        Employee employee = new Employee("Tom", 1000, new MyDate(2017, 1, 1));
        Faculty faculty = new Faculty("Tom", 1000, new MyDate(2017, 1, 1), "8:00-12:00", "Professor");
        Staff staff = new Staff("Tom", 1000, new MyDate(2017, 1, 1), "Programmer");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
