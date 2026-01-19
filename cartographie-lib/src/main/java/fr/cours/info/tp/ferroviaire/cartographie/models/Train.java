package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.List;

public class Train {
    private String matricule;
    private TypeTrain type;       // TER ou TGV
    private double vitesseMax;

    public Train() {
    }

    public Train(String matricule, TypeTrain type, double vitesseMax, List<Wagon> wagons) {
        this.matricule = matricule;
        this.type = type;
        this.vitesseMax = vitesseMax;
        this.wagons = wagons;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public TypeTrain getType() {
        return type;
    }

    public void setType(TypeTrain type) {
        this.type = type;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    private List<Wagon> wagons;
}
