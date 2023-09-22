package org.example.diContainer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class DIContainer {
    private Set<Object> beanSet = new HashSet<>();
    public DIContainer(Set<Class<?>> classSet) throws NoSuchMethodException, InvocationTargetException,
                                                      InstantiationException, IllegalAccessException {
        // Create bean and add into beanSet for each class in classSet
        for(Class<?> classBean : classSet) {
            Constructor constructor = classBean.getConstructor();
            constructor.setAccessible(true);
            Object instance = constructor.newInstance();
            this.beanSet.add(instance);
        }
        // Wire the beans together through setter
        for(Object bean : this.beanSet) {
            for(Field field : bean.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                for(Object wiredBean : this.beanSet) {
                    if(fieldType.isInstance(wiredBean)) field.set(bean, wiredBean);
                }
            }
        }

    }
    public <T> T getBean(Class<T> tClass) {
        for(Object bean : this.beanSet) {
            if(tClass.isInstance(bean)) return (T)bean;
        }
        return null;
    }
}
