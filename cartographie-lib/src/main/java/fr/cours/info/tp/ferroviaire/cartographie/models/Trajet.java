package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.time.LocalDateTime;

public class Trajet {
    private Gare depart;
    private Gare arrivee;
    private Quai quaiDepart;

    public Trajet() {
    }

    public Gare getDepart() {
        return depart;
    }

    public Trajet(Gare depart, Gare arrivee, Quai quaiDepart, LocalDateTime heureDepart, Train train) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.quaiDepart = quaiDepart;
        this.heureDepart = heureDepart;
        this.train = train;
    }

    public void setDepart(Gare depart) {
        this.depart = depart;
    }

    public Gare getArrivee() {
        return arrivee;
    }

    public void setArrivee(Gare arrivee) {
        this.arrivee = arrivee;
    }

    public Quai getQuaiDepart() {
        return quaiDepart;
    }

    public void setQuaiDepart(Quai quaiDepart) {
        this.quaiDepart = quaiDepart;
    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDateTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    private LocalDateTime heureDepart;
    private Train train;
}
