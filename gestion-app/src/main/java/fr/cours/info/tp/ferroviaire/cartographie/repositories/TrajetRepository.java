package fr.cours.info.tp.ferroviaire.cartographie.repositories;

import fr.cours.info.tp.ferroviaire.cartographie.entities.TrajetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrajetRepository extends JpaRepository<TrajetEntity, Long> {

    List<TrajetEntity> findByGareDepartAndGareArrivee(String gareDepart, String gareArrivee);
}
