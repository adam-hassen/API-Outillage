package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.List;

public class Gare {
    private String nom;
    private List<Quai> quais;
    public Gare() {
    }
    public String getNom() {
        return nom;
    }

    public Gare(String nom, List<Quai> quais) {
        this.nom = nom;
        this.quais = quais;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Quai> getQuais() {
        return quais;
    }

    public void setQuais(List<Quai> quais) {
        this.quais = quais;
    }
}
