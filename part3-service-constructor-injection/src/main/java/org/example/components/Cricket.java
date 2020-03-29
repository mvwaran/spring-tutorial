package org.example.components;

import org.example.services.AccessoriesService;

public class Cricket implements Sport {

    private AccessoriesService accessoriesService;

    public Cricket(AccessoriesService accessoriesService) {
        System.out.println("Cricket Constructor called");
        this.accessoriesService = accessoriesService;
    }

    @Override
    public String getAccessories() {
        return accessoriesService.getCricketAccessories();
    }
}
