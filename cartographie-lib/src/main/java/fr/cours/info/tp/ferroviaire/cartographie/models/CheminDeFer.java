package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.List;

public class CheminDeFer {
    private Gare gareDepart;
    private Gare gareArrivee;
    private double distance;
    private List<Voie> voies;

    public CheminDeFer() {
    }

    public Gare getGareDepart() {
        return gareDepart;
    }

    public CheminDeFer(Gare gareDepart, Gare gareArrivee, double distance, List<Voie> voies) {
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.distance = distance;
        this.voies = voies;
    }

    public void setGareDepart(Gare gareDepart) {
        this.gareDepart = gareDepart;
    }

    public Gare getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(Gare gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }
}
