package fr.cours.info.tp.ferroviaire.controller;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrainWebController {

    @Autowired
    private TrainService service;

    @GetMapping("/train")
    public String afficherTrain(
            @RequestParam String matricule,
            Model model) {

        TrainDAO train = service.rechercher(matricule);
        model.addAttribute("train", train);

        return "train";
    }
}
