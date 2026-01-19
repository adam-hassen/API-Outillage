package fr.cours.info.tp.ferroviaire.cartographie.api;
import fr.cours.info.tp.ferroviaire.cartographie.models.*;

import java.util.List;
public interface CartographieAPI {

    void ajouterGare(Gare gare);
    List<Gare> listerGares();
    void ajouterCheminDeFer(CheminDeFer chemin);
    List<CheminDeFer> listerCheminsDeFer();
    double calculerDistance(Gare depart, Gare arrivee);

    void ajouterQuai(Quai quai);
    List<Quai> getQuais();
}
