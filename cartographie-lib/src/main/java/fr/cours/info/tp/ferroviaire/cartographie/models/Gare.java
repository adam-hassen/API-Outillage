package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Gare {

    private String nom;
    private int nombreQuais;

    public Gare(String nom, int nombreQuais) {
        this.nom = nom;
        this.nombreQuais = nombreQuais;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }
}
