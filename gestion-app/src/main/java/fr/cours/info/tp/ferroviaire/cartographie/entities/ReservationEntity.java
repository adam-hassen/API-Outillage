package fr.cours.info.tp.ferroviaire.cartographie.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reservations")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomClient;

    @ManyToOne
    @JoinColumn(name = "trajet_id", nullable = false)
    private TrajetEntity trajet;

    public ReservationEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public TrajetEntity getTrajet() {
        return trajet;
    }

    public void setTrajet(TrajetEntity trajet) {
        this.trajet = trajet;
    }
}
