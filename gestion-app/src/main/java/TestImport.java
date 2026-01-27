import fr.cours.info.tp.ferroviaire.cartographie.models.Gare;
import fr.cours.info.tp.ferroviaire.cartographie.services.ReseauService;

public class TestImport {

    public static void main(String[] args) {
        ReseauService service = new ReseauService();
        Gare gare = new Gare("Test", 1);

        System.out.println(gare.getNom());
    }
}
