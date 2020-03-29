package org.example.components;

import org.example.services.AccessoriesService;

public class Badminton implements Sport {

    private AccessoriesService accessoriesService;

    public Badminton(AccessoriesService accessoriesService) {
        System.out.println("Badminton Constructor called");
        this.accessoriesService = accessoriesService;
    }

    @Override
    public String getAccessories() {
        return accessoriesService.getBadmintonAccessories();
    }
}
