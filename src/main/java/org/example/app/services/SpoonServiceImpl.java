package org.example.app.services;

import org.example.framework.annotations.Autowired;
import org.example.framework.annotations.Component;

@Component
public class SpoonServiceImpl implements SpoonService {

    @Override
    public void giveSpoon() {
        System.out.println("spoon service task");
    }
}
