package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Bezeichnung : I18nSpanishGreetingService
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Profile({"ES", "default"})
@Service("i18nSerivce")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
