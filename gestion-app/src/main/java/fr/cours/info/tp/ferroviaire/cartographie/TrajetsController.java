package fr.cours.info.tp.ferroviaire.cartographie;

import fr.cours.info.tp.ferroviaire.cartographie.entities.TrajetEntity;
import fr.cours.info.tp.ferroviaire.cartographie.entities.TrainEntity;
import fr.cours.info.tp.ferroviaire.cartographie.repositories.TrajetRepository;
import fr.cours.info.tp.ferroviaire.cartographie.repositories.TrainRepository;
import org.openapitools.api.TrajetsApi;
import org.openapitools.model.Trajet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrajetsController implements TrajetsApi {

    private final TrajetRepository trajetRepository;
    private final TrainRepository trainRepository;

    public TrajetsController(TrajetRepository trajetRepository,
                             TrainRepository trainRepository) {
        this.trajetRepository = trajetRepository;
        this.trainRepository = trainRepository;
    }

    @Override
    public ResponseEntity<List<Trajet>> trajetsRechercherGet(
            String gareDepart,
            String gareArrivee) {

        // 1️⃣ récupérer les trajets depuis la BD
        List<TrajetEntity> entities =
                trajetRepository.findByGareDepartAndGareArrivee(gareDepart, gareArrivee);

        // 2️⃣ conversion Entity → OpenAPI Model
        List<Trajet> result = entities.stream().map(entity -> {
            Trajet trajet = new Trajet();
            trajet.setId(entity.getId().intValue());
            trajet.setGareDepart(entity.getGareDepart());
            trajet.setGareArrivee(entity.getGareArrivee());
            trajet.setDureeMinutes(entity.getDureeMinutes());

            // ✅ ICI la correction importante
            trajet.setTrainMatricule(entity.getTrain().getMatricule());

            return trajet;
        }).toList();

        return ResponseEntity.ok(result);
    }
}
