package org.example.services;

public class AccessoriesServiceImpl implements AccessoriesService {

    public AccessoriesServiceImpl() {
        System.out.println("AccessoriesServiceImpl Constructor called");
    }

    @Override
    public String getCricketAccessories() {
        return "Bat, Ball, Stumps";
    }

    @Override
    public String getBadmintonAccessories() {
        return "Racket, Shuttlecock, Net";
    }
}
