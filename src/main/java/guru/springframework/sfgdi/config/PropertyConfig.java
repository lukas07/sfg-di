package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Bezeichnung : PropertyConfig
 * Beschreibung:
 * Erstellt    : 12/2020 - L .Breit
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    /* VARIABLEN */
    @Value("${guru_username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    /* KONSTRUKTOR */

    /* GETTER & SETTER */

    /* METHODEN */
    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
