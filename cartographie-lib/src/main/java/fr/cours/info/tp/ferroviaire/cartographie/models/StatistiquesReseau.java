package fr.cours.info.tp.ferroviaire.cartographie.models;

public class StatistiquesReseau {
    private int nombreGares;
    private int nombreTrains;

    public int getNombreGares() {
        return nombreGares;
    }

    public StatistiquesReseau() {
    }

    public StatistiquesReseau(int nombreGares, int nombreTrains, double distanceTotale) {
        this.nombreGares = nombreGares;
        this.nombreTrains = nombreTrains;
        this.distanceTotale = distanceTotale;
    }

    public void setNombreGares(int nombreGares) {
        this.nombreGares = nombreGares;
    }

    public int getNombreTrains() {
        return nombreTrains;
    }

    public void setNombreTrains(int nombreTrains) {
        this.nombreTrains = nombreTrains;
    }

    public double getDistanceTotale() {
        return distanceTotale;
    }

    public void setDistanceTotale(double distanceTotale) {
        this.distanceTotale = distanceTotale;
    }

    private double distanceTotale;
}
