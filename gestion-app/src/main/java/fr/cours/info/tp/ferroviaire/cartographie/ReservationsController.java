package fr.cours.info.tp.ferroviaire.cartographie;

import fr.cours.info.tp.ferroviaire.cartographie.entities.ReservationEntity;
import fr.cours.info.tp.ferroviaire.cartographie.entities.TrajetEntity;
import fr.cours.info.tp.ferroviaire.cartographie.repositories.ReservationRepository;
import fr.cours.info.tp.ferroviaire.cartographie.repositories.TrajetRepository;
import org.openapitools.api.ReservationsApi;
import org.openapitools.model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationsController implements ReservationsApi {

    private final ReservationRepository reservationRepository;
    private final TrajetRepository trajetRepository;

    public ReservationsController(ReservationRepository reservationRepository,
                                  TrajetRepository trajetRepository) {
        this.reservationRepository = reservationRepository;
        this.trajetRepository = trajetRepository;
    }

    @Override
    public ResponseEntity<Void> reservationsPost(Reservation reservation) {

        // 1) Trouver le trajet en BD avec l’id reçu dans l’API
        Long trajetId = reservation.getTrajetId().longValue(); // si getTrajetId() est Integer
        TrajetEntity trajetEntity = trajetRepository.findById(trajetId)
                .orElseThrow(() -> new IllegalArgumentException("Trajet introuvable id=" + trajetId));

        // 2) Construire l'entité Reservation
        ReservationEntity entity = new ReservationEntity();
        entity.setNomClient(reservation.getNomUsager());
        entity.setTrajet(trajetEntity);

        reservationRepository.save(entity);

        return ResponseEntity.status(201).build();
    }

    @Override
    public ResponseEntity<Void> reservationsIdDelete(Integer id) {
        reservationRepository.deleteById(id.longValue());
        return ResponseEntity.noContent().build();
    }
}
