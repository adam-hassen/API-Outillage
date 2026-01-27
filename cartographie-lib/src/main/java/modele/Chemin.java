package modele;

public class Chemin {

    private long idChemin;
    private double distance;

    public Chemin() {}

    public Chemin(long idChemin, double distance) {
        this.idChemin = idChemin;
        this.distance = distance;
    }

    public long getIdChemin() {
        return idChemin;
    }

    public void setIdChemin(long idChemin) {
        this.idChemin = idChemin;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
