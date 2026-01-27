package modele;

public class Voie {

    private long idVoie;
    private int numero;
    private String sensCirculation;
    private double vitesseMax;

    public Voie() {}

    public Voie(long idVoie, int numero, String sensCirculation, double vitesseMax) {
        this.idVoie = idVoie;
        this.numero = numero;
        this.sensCirculation = sensCirculation;
        this.vitesseMax = vitesseMax;
    }

    public long getIdVoie() {
        return idVoie;
    }

    public void setIdVoie(long idVoie) {
        this.idVoie = idVoie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSensCirculation() {
        return sensCirculation;
    }

    public void setSensCirculation(String sensCirculation) {
        this.sensCirculation = sensCirculation;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
}
