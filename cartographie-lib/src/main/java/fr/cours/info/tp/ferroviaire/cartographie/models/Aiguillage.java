package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Aiguillage {
    private Voie voieEntree;
    private Voie voieSortie;

    public Aiguillage() {
    }

    public Voie getVoieEntree() {
        return voieEntree;
    }

    public Aiguillage(Voie voieEntree, Voie voieSortie) {
        this.voieEntree = voieEntree;
        this.voieSortie = voieSortie;
    }

    public void setVoieEntree(Voie voieEntree) {
        this.voieEntree = voieEntree;
    }

    public Voie getVoieSortie() {
        return voieSortie;
    }

    public void setVoieSortie(Voie voieSortie) {
        this.voieSortie = voieSortie;
    }
}
