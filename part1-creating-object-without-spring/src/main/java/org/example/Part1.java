package org.example;

public class Part1 {
    public static void main( String[] args ) {
        Sport cricket = new Cricket();
        Sport badminton = new Badminton();
        System.out.println(cricket.getAccessories());
        System.out.println(badminton.getAccessories());
    }
}
