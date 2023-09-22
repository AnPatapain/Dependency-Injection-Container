package org.example;

import org.example.diContainer.*;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
                                                  InstantiationException, IllegalAccessException {
        DIContainer diContainer = createAppContext();
        businessLogic(diContainer);
    }

    private static void businessLogic(DIContainer diContainer) {
        ServiceB serviceB = diContainer.getBean(ServiceB.class);
        ServiceA serviceA = diContainer.getBean(ServiceA.class);
        System.out.println(serviceB.jobB());
        System.out.println(serviceA.jobA());
    }

    private static DIContainer createAppContext() throws NoSuchMethodException, InvocationTargetException,
                                                         InstantiationException, IllegalAccessException {
        Set<Class<?>> classSet = new HashSet<>();
        classSet.add(ServiceAImpl.class);
        classSet.add(ServiceBImpl.class);
        return new DIContainer(classSet);
    }
}