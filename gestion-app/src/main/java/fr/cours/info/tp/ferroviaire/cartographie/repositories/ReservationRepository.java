package fr.cours.info.tp.ferroviaire.cartographie.repositories;

import fr.cours.info.tp.ferroviaire.cartographie.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository
        extends JpaRepository<ReservationEntity, Long> {
}
