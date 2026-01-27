package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

public class CheminDeFer {

    private String identifiant;
    private int distance;
    private Gare depart;
    private Gare arrivee;
    private List<Voie> voies = new ArrayList<>();

    public CheminDeFer(String identifiant, Gare depart, Gare arrivee, int distance) {
        this.identifiant = identifiant;
        this.depart = depart;
        this.arrivee = arrivee;
        this.distance = distance;
    }

    public void ajouterVoie(Voie voie) {
        voies.add(voie);
    }

    public List<Voie> getVoies() {
        return voies;
    }
}
