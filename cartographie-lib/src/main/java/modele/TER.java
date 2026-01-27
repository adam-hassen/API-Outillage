package modele;

public class TER extends Train {

    private static final double VITESSE_MAX = 160.0;

    @Override
    public double getVitesseMax() {
        return VITESSE_MAX;
    }
}
