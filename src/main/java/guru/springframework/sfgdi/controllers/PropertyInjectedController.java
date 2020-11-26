package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Bezeichnung : PropertyInjectedController
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreetings() {
        return greetingService.sayGreeting();
    }
}
