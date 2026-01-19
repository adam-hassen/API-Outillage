package fr.cours.info.tp.ferroviaire.controller;

import fr.cours.info.tp.ferroviaire.cartographie.api.CartographieAPI;
import fr.cours.info.tp.ferroviaire.cartographie.impl.CartographieServiceImpl;
import fr.cours.info.tp.ferroviaire.cartographie.models.Gare;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gares")
public class GareController {

    private final CartographieAPI cartographie = new CartographieServiceImpl();

    @PostMapping
    public void ajouterGare(@RequestBody Gare gare) {
        cartographie.ajouterGare(gare);
    }

    @GetMapping
    public List<Gare> listerGares() {
        return cartographie.listerGares();
    }
}
