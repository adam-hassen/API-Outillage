package modele;

public class Gare {

    private long idGare;
    private String nom;
    private String ville;
    private String codePostal;
    private int nombreQuais;

    public Gare() {}

    public Gare(long idGare, String nom, String ville, String codePostal, int nombreQuais) {
        this.idGare = idGare;
        this.nom = nom;
        this.ville = ville;
        this.codePostal = codePostal;
        this.nombreQuais = nombreQuais;
    }

    public long getIdGare() {
        return idGare;
    }

    public void setIdGare(long idGare) {
        this.idGare = idGare;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }
}

