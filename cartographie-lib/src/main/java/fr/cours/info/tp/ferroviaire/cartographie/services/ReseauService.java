package fr.cours.info.tp.ferroviaire.cartographie.services;

import fr.cours.info.tp.ferroviaire.cartographie.models.*;


public class ReseauService {

    public Reseau creerReseau(String nom) {
        return new Reseau(nom);
    }

    public Gare creerGare(String nom, int nombreQuais) {
        return new Gare(nom, nombreQuais);
    }

    public CheminDeFer creerCheminDeFer(String id, Gare a, Gare b, int distance) {
        return new CheminDeFer(id, a, b, distance);
    }

    public Voie creerVoie(String id, int vitesseMax, Sens sens) {
        return new Voie(id, vitesseMax, sens);
    }

    public void ajouterGare(Reseau reseau, Gare gare) {
        reseau.ajouterGare(gare);
    }

    public void ajouterChemin(Reseau reseau, CheminDeFer chemin) {
        reseau.ajouterChemin(chemin);
    }

    public void ajouterVoie(CheminDeFer chemin, Voie voie) {
        chemin.ajouterVoie(voie);
    }
}
