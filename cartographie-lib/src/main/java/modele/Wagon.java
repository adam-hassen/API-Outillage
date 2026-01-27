package modele;


import java.util.List;

public class Wagon {

    private long idWagon;
    private int numeroWagon;
    private List<Place> places;

    public Wagon() {}

    public long getIdWagon() {
        return idWagon;
    }

    public void setIdWagon(long idWagon) {
        this.idWagon = idWagon;
    }

    public int getNumeroWagon() {
        return numeroWagon;
    }

    public void setNumeroWagon(int numeroWagon) {
        this.numeroWagon = numeroWagon;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
