package org.example.app.services;

import org.example.framework.annotations.Autowired;
import org.example.framework.annotations.Component;


@Component
public class CupServiceImpl implements CupService {

    @Override
    public void giveCup() {
        System.out.println("Cup service task");
    }
}
