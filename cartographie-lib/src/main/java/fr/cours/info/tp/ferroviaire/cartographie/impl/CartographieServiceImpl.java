package fr.cours.info.tp.ferroviaire.cartographie.impl;

import fr.cours.info.tp.ferroviaire.cartographie.api.CartographieAPI;
import fr.cours.info.tp.ferroviaire.cartographie.models.*;

import java.util.ArrayList;
import java.util.List;

public class CartographieServiceImpl implements CartographieAPI {
    private List<Gare> gares = new ArrayList<>();
    private List<CheminDeFer> chemins = new ArrayList<>();
    private List<Quai> quais = new ArrayList<>();
    @Override
    public void ajouterGare(Gare gare) {
        gares.add(gare);
    }

    @Override
    public List<Gare> listerGares() {
        return gares;
    }

    @Override
    public void ajouterCheminDeFer(CheminDeFer chemin) {
        chemins.add(chemin);
    }

    @Override
    public List<CheminDeFer> listerCheminsDeFer() {
        return chemins;
    }

    @Override
    public double calculerDistance(Gare depart, Gare arrivee) {
        // simple pour l’instant (le TP n’exige pas plus)
        return 0.0;
    }

    @Override
    public void ajouterQuai(Quai quai) {
        quais.add(quai);
    }

    @Override
    public List<Quai> getQuais() {
        return quais;
    }
}
