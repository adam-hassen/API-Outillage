import fr.cours.info.tp.ferroviaire.cartographie.models.*;
import fr.cours.info.tp.ferroviaire.cartographie.services.ReseauService;

public class Main {

    public static void main(String[] args) {

        ReseauService service = new ReseauService();

        // Création du réseau
        Reseau reseau = service.creerReseau("Reseau TP");

        // Création de la gare B avec 1 quai
        Gare gareB = service.creerGare("Gare B", 1);
        service.ajouterGare(reseau, gareB);

        // Création des gares A et C
        Gare gareA = service.creerGare("Gare A", 2);
        Gare gareC = service.creerGare("Gare C", 2);
        service.ajouterGare(reseau, gareA);
        service.ajouterGare(reseau, gareC);

        // Chemin A -> B avec 1 voie
        CheminDeFer cheminAB = service.creerCheminDeFer("AB", gareA, gareB, 10);
        Voie voieAB = service.creerVoie("AB-1", 160, Sens.ALLER);
        service.ajouterVoie(cheminAB, voieAB);
        service.ajouterChemin(reseau, cheminAB);

        // Chemin B -> C avec 2 voies
        CheminDeFer cheminBC = service.creerCheminDeFer("BC", gareB, gareC, 20);
        service.ajouterVoie(cheminBC, service.creerVoie("BC-1", 160, Sens.ALLER));
        service.ajouterVoie(cheminBC, service.creerVoie("BC-2", 160, Sens.RETOUR));
        service.ajouterChemin(reseau, cheminBC);

        System.out.println("✅ Scénario 1 exécuté avec succès");
    }
}
