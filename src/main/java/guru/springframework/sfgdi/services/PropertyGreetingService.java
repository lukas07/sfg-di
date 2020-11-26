package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Bezeichnung : PropertyGreetingService
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property!!";
    }
}
