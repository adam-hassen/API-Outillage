package fr.cours.info.tp.ferroviaire.cartographie.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "trajets")
public class TrajetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String gareDepart;

    @Column(nullable = false)
    private String gareArrivee;

    @Column(nullable = false)
    private int dureeMinutes;

    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private TrainEntity train;

    public TrajetEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(String gareDepart) {
        this.gareDepart = gareDepart;
    }

    public String getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(String gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public TrainEntity getTrain() {
        return train;
    }

    public void setTrain(TrainEntity train) {
        this.train = train;
    }
}
