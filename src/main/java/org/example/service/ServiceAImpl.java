package org.example.service;

import org.example.framework.annotations.Autowired;
import org.example.framework.annotations.Component;


@Component
public class ServiceAImpl implements ServiceA {
    @Autowired
    private ServiceB serviceB;

    @Override
    public String jobA() {
        return "jobA("+ serviceB.jobB() +")";
    }

    @Override
    public ServiceB getServiceB() {
        return serviceB;
    }

    @Override
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
