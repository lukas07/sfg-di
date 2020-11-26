package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Bezeichnung : I18nEnglishGreetingService
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Profile("EN")
@Service("i18nSerivce")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
