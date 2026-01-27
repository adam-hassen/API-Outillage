package fr.cours.info.tp.ferroviaire.cartographie.repositories;

import fr.cours.info.tp.ferroviaire.cartographie.entities.TrainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainRepository extends JpaRepository<TrainEntity, Long> {

    Optional<TrainEntity> findByMatricule(String matricule);
}
