package fr.cours.info.tp.ferroviaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "fr.cours.info.tp.ferroviaire")
@EntityScan("fr.cours.info.tp.ferroviaire")
@EnableJpaRepositories("fr.cours.info.tp.ferroviaire")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("runing");
    }
}
