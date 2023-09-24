package org.example.app.clients;

import org.example.app.services.CoffeePowderService;
import org.example.app.services.CupService;
import org.example.app.services.SpoonService;
import org.example.framework.annotations.Autowired;
import org.example.framework.annotations.Component;

@Component
public class CoffeeMaker {
    @Autowired
    private CupService cupService;
    @Autowired
    private SpoonService spoonService;
    @Autowired
    private CoffeePowderService coffeePowderService;

    public void makeCoffee() {
        cupService.giveCup();
        spoonService.giveSpoon();
        coffeePowderService.giveCoffeePowder();

        System.out.println("Here is your coffee cup, sir");
    }
}
