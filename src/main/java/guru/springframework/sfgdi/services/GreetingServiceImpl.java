package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Bezeichnung : GreetingServiceImpl
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!!";
    }
}
