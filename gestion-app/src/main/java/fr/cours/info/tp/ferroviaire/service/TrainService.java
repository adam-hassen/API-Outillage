package fr.cours.info.tp.ferroviaire.service;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.bdd.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    private final TrainRepository repository;

    @Autowired
    public TrainService(TrainRepository repository) {
        this.repository = repository;
    }

    public TrainDAO rechercher(String matricule) {
        return repository.findByMatricule(matricule);
    }
}
