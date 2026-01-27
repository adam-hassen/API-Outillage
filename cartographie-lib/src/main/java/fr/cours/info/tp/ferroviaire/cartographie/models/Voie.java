package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Voie {

    private String identifiant;
    private int vitesseMax;
    private Sens sens;

    public Voie(String identifiant, int vitesseMax, Sens sens) {
        this.identifiant = identifiant;
        this.vitesseMax = vitesseMax;
        this.sens = sens;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public Sens getSens() {
        return sens;
    }
}
