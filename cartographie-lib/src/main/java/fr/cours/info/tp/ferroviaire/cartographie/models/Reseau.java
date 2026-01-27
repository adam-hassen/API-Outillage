package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

public class Reseau {

    private String nom;
    private List<Gare> gares = new ArrayList<>();
    private List<CheminDeFer> cheminsDeFer = new ArrayList<>();

    public Reseau(String nom) {
        this.nom = nom;
    }

    public void ajouterGare(Gare gare) {
        gares.add(gare);
    }

    public void ajouterChemin(CheminDeFer chemin) {
        cheminsDeFer.add(chemin);
    }
}
