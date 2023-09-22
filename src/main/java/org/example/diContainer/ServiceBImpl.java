package org.example.diContainer;

public class ServiceBImpl implements ServiceB{
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
