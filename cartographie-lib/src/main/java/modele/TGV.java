package modele;

public class TGV extends Train {

    private static final double VITESSE_MAX = 320.0;

    @Override
    public double getVitesseMax() {
        return VITESSE_MAX;
    }
}

