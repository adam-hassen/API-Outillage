package modele;

import java.time.LocalDateTime;

public class Trajet {

    private long idTrajet;
    private Gare gareDepart;
    private Gare gareArrivee;
    private LocalDateTime heureDepart;
    private LocalDateTime heureArrivee;
    private int duree;
    private Train train;
    public Trajet() {}
}

