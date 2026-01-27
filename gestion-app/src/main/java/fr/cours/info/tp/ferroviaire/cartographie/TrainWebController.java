package fr.cours.info.tp.ferroviaire.cartographie;

import fr.cours.info.tp.ferroviaire.cartographie.entities.TrainEntity;
import fr.cours.info.tp.ferroviaire.cartographie.repositories.TrainRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrainWebController {

    private final TrainRepository trainRepository;

    public TrainWebController(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @GetMapping("/train")
    public String afficherTrain(
            @RequestParam String matricule,
            Model model
    ) {
        TrainEntity train = trainRepository
                .findByMatricule(matricule)
                .orElseThrow(() -> new RuntimeException("Train introuvable"));

        model.addAttribute("train", train);
        return "train"; // train.html
    }
}
