package org.example.components;

import org.example.services.AccessoriesService;

public class Badminton implements Sport {

    private String association;
    private AccessoriesService accessoriesService;

    public Badminton() {
        System.out.println("Badminton constructor called");
    }

    @Override
    public String getAccessories() {
        return accessoriesService.getBadmintonAccessories();
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getAssociation() {
        return association;
    }

    public void setAccessoriesService(AccessoriesService accessoriesService) {
        this.accessoriesService = accessoriesService;
    }
}
