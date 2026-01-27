package fr.cours.info.tp.ferroviaire.bdd.Repositories;

import fr.cours.info.tp.ferroviaire.bdd.modele.TrainDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends CrudRepository<TrainDAO, Long> {

    TrainDAO findByMatricule(String matricule);
}