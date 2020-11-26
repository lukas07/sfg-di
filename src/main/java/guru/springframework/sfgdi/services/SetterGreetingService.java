package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Bezeichnung : SetterGreetingService
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter!!";
    }
}
