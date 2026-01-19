package fr.cours.info.tp.ferroviaire.controller;

import fr.cours.info.tp.ferroviaire.cartographie.api.CartographieAPI;
import fr.cours.info.tp.ferroviaire.cartographie.impl.CartographieServiceImpl;
import fr.cours.info.tp.ferroviaire.cartographie.models.Quai;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quais")
public class QuaiController {

    private final CartographieAPI cartographie = new CartographieServiceImpl();


    // POST /quais
    @PostMapping
    public void ajouterQuai(@RequestBody Quai quai) {
        cartographie.ajouterQuai(quai);
    }

    // GET /quais
    @GetMapping
    public List<Quai> getQuais() {
        return cartographie.getQuais();
    }
}
