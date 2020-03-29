package org.example.components;

import org.example.services.AccessoriesService;

public class Cricket implements Sport {

    private String association;
    private AccessoriesService accessoriesService;

    public Cricket() {
        System.out.println("Cricket Constructor called");
    }

    @Override
    public String getAccessories() {
        return accessoriesService.getCricketAccessories();
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
