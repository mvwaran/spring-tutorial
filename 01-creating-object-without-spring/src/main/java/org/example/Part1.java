package org.example;

public class Part1 {
    public static void main( String[] args ) {
        Person student = new Student();
        Person employee = new Employee();
        System.out.println(student.echo());
        System.out.println(employee.echo());
    }
}
