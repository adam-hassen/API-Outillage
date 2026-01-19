package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Wagon {
    private int nombrePlaces;
    private TypePlace typePlace;

    public Wagon() {
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public Wagon(int nombrePlaces, TypePlace typePlace) {
        this.nombrePlaces = nombrePlaces;
        this.typePlace = typePlace;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public TypePlace getTypePlace() {
        return typePlace;
    }

    public void setTypePlace(TypePlace typePlace) {
        this.typePlace = typePlace;
    }
}
