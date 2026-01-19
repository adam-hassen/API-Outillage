package fr.cours.info.tp.ferroviaire.controller;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {

    private final TrainService service;

    @Autowired
    public TrainController(TrainService service) {
        this.service = service;
    }

    @GetMapping("/train/consulter")
    public TrainDAO consulterTrain(
            @RequestParam String matricule
    ) {
        return service.rechercher(matricule);
    }
}
