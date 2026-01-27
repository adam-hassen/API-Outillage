package fr.cours.info.tp.ferroviaire.cartographie.config;

import fr.cours.info.tp.ferroviaire.cartographie.services.ReseauService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ReseauService reseauService() {
        return new ReseauService();
    }
}
