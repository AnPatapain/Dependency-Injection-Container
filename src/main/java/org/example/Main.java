package org.example;

import org.example.framework.diContainer.*;
import org.example.service.ServiceA;
import org.example.service.ServiceAImpl;
import org.example.service.ServiceB;
import org.example.service.ServiceBImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
                                                  InstantiationException, IllegalAccessException {

        DIContainer diContainer = DIContainer.createAppContext(Main.class.getPackage().getName());
        businessLogic(diContainer);
    }

    private static void businessLogic(DIContainer diContainer) {
        diContainer.displayAllBeans();
        ServiceB serviceB = diContainer.getBean(ServiceB.class);
        ServiceA serviceA = diContainer.getBean(ServiceA.class);
        System.out.println(serviceB.jobB());
        System.out.println(serviceA.jobA());
    }
}