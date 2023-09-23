package org.example.service;

import org.example.framework.annotations.Autowired;
import org.example.framework.annotations.Component;

@Component
public class ServiceBImpl implements ServiceB {
    @Autowired
    private ServiceA serviceA;
    @Override
    public String jobB() {
        return "jobB()";
    }

    @Override
    public ServiceA getServiceA() {
        return serviceA;
    }

    @Override
    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
