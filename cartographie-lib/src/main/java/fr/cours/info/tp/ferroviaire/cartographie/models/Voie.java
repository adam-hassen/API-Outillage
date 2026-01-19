package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Voie {
    private String sens;

    public String getSens() {
        return sens;
    }

    public Voie() {
    }

    public Voie(String sens, double vitesseMax) {
        this.sens = sens;
        this.vitesseMax = vitesseMax;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    private double vitesseMax;
}
