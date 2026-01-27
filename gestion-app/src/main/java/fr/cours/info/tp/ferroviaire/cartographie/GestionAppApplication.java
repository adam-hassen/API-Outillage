package fr.cours.info.tp.ferroviaire.cartographie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "fr.cours.info.tp.ferroviaire.cartographie"
        }
)
public class GestionAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionAppApplication.class, args);
    }
}
