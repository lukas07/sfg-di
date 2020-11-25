package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Bezeichnung : MyController
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");

        return "Hi Dana!";
    }
}
