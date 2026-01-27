package fr.cours.info.tp.ferroviaire.cartographie;

import fr.cours.info.tp.ferroviaire.cartographie.entities.TrainEntity;
import fr.cours.info.tp.ferroviaire.cartographie.repositories.TrainRepository;
import org.openapitools.api.TrainApi;
import org.openapitools.model.Train;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController implements TrainApi {

    private final TrainRepository trainRepository;

    public TrainController(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @Override
    public ResponseEntity<Train> trainConsulterGet(String matricule) {

        TrainEntity entity = new TrainEntity();
        entity.setMatricule(matricule);
        entity.setType("TGV");

        trainRepository.save(entity);

        Train apiTrain = new Train();
        apiTrain.setMatricule(entity.getMatricule());
        apiTrain.setType(Train.TypeEnum.fromValue(entity.getType()));


        return ResponseEntity.ok(apiTrain);
    }
}
