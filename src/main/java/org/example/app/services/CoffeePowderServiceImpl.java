package org.example.app.services;

import org.example.framework.annotations.Component;

@Component
public class CoffeePowderServiceImpl implements CoffeePowderService{

    @Override
    public void giveCoffeePowder() {
        System.out.println("Coffee powder service task");
    }
}
