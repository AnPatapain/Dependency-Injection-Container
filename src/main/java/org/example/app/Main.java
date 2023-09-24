package org.example.app;

import org.example.app.clients.CoffeeMaker;
import org.example.framework.diContainer.*;
import org.example.app.services.CupService;
import org.example.app.services.SpoonService;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {

        DIContainer diContainer = DIContainer.createAppContext(Main.class.getPackage().getName());
        makeCoffee(diContainer);
    }

    private static void makeCoffee(DIContainer diContainer) {
        CoffeeMaker coffeeMaker = diContainer.getBean(CoffeeMaker.class);
        coffeeMaker.makeCoffee();
    }
}